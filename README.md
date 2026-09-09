# WhisperCoin — Private, on-device expense tracker

<div align="center">

<img src="banner.png" alt="WhisperCoin banner" width="640"/>

[![License](https://img.shields.io/badge/License-AGPL%20v3-blue.svg)](LICENSE)
[![Android](https://img.shields.io/badge/Android-8.0+-3DDC84)](https://developer.android.com/about/versions/oreo)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.0.21-7F52FF)](https://kotlinlang.org/)

*An Android expense tracker that parses bank SMS and PDF statements on your phone. No cloud, no uploads, no tracking.*

[Quick Start](#quick-start) • [Features](#features) • [Screenshots](#screenshots) • [Tech Stack](#tech-stack) • [Contributing](#contributing)

</div>

---

## Features

- **On-device SMS parsing** — Reads transaction SMS from 80+ banks across 14 countries locally.
- **PDF statement import** — Extracts UPI and card transactions from GPay, PhonePe, and bank PDFs.
- **Budgeting** — Monthly budgets with visual progress and category breakdowns.
- **Subscription tracking** — Detects and monitors recurring payments.
- **Cash wallet** — Default wallet for manual cash expenses.
- **Custom categories** — Create and manage categories and subcategories.
- **Multi-currency** — Supports INR, USD, AED, NPR, THB, ETB, TZS, PKR, IRR, SAR, EGP, KES, COP, BYN with localized formatting.
- **On-device AI assistant** — Ask questions about spending using a local MediaPipe / Qwen 2.5 model.
- **Data export** — Export transactions to CSV for taxes or records.
- **Biometric lock** — App-level authentication support.

## Screenshots

<table>
<tr>
<td><img src="screenshots/home.png" alt="Home screen" width="160"/></td>
<td><img src="screenshots/analytics.png" alt="Analytics screen" width="160"/></td>
<td><img src="screenshots/chat.png" alt="AI chat screen" width="160"/></td>
<td><img src="screenshots/settings.png" alt="Settings screen" width="160"/></td>
</tr>
<tr>
<td align="center">Home</td>
<td align="center">Analytics</td>
<td align="center">AI Chat</td>
<td align="center">Settings</td>
</tr>
<tr>
<td><img src="screenshots/subscriptions.png" alt="Subscriptions screen" width="160"/></td>
<td><img src="screenshots/transactions.png" alt="Transactions screen" width="160"/></td>
<td><img src="screenshots/account_detail.png" alt="Account detail screen" width="160"/></td>
<td><img src="screenshots/categories.png" alt="Categories screen" width="160"/></td>
</tr>
<tr>
<td align="center">Subscriptions</td>
<td align="center">Transactions</td>
<td align="center">Account Details</td>
<td align="center">Categories</td>
</tr>
<tr>
<td><img src="screenshots/budgets.png" alt="Budgets screen" width="160"/></td>
<td><img src="screenshots/budget_details.png" alt="Budget details screen" width="160"/></td>
<td><img src="screenshots/budget_history.png" alt="Budget history screen" width="160"/></td>
<td><img src="screenshots/profile.png" alt="Profile screen" width="160"/></td>
</tr>
<tr>
<td align="center">Budgets</td>
<td align="center">Budget Details</td>
<td align="center">Budget History</td>
<td align="center">Profile</td>
</tr>
</table>

## Tech Stack

| Layer | Technology |
|---|---|
| UI | Jetpack Compose + Material 3 |
| Architecture | MVVM + Clean Architecture, unidirectional data flow with StateFlow |
| Dependency Injection | Hilt |
| Database | Room |
| Background work | WorkManager |
| AI / LLM | MediaPipe with Qwen 2.5 (on-device) |
| Parser | Standalone `parser-core` Kotlin/JVM module |
| Build | Gradle Kotlin DSL, version catalogs |

## Project Structure

```
.
├── app/                    # Main Android application
│   ├── src/main/           # UI, ViewModels, Room, Hilt, SMS/PDF parsing
│   └── src/test/           # Unit and integration tests
├── parser-core/            # Standalone bank SMS/PDF parser (no Android deps)
│   └── src/main/kotlin/com/alzimer/whispercoin/parser/core/
├── docs/                   # Project documentation (gitignored, local only)
├── .github/                # Issue templates, PR template, CI workflows
├── fastlane/               # Store metadata
├── gradle/                 # Gradle wrapper
├── scripts/                # Release and utility scripts
└── screenshots/            # Store and README screenshots
```

## Quick Start

```bash
# Clone the repository
git clone https://github.com/alzimerahmed/WhisperCoin.git
cd WhisperCoin

# Run the parser-core tests (pure JVM, no Android SDK needed)
./gradlew :parser-core:test

# Build the debug APK (requires Android SDK)
./gradlew assembleDebug

# Install on a connected device
adb install app/build/outputs/apk/debug/app-debug.apk
```

### Requirements

- Android 8.0+ (API 26)
- Android Studio Ladybug or newer
- JDK 17

## Usage

1. Grant read-only SMS permission when prompted.
2. WhisperCoin scans transaction messages and PDF statements in the background.
3. Open the app to view the transaction timeline, budgets, subscriptions, and ask the on-device AI about your spending.

## Supported Banks

WhisperCoin supports **80+ banks** across **14 countries**, including:

- **India**: HDFC, SBI, ICICI, Axis, PNB, IDBI, Federal, Kotak, Yes, IndusInd, Canara, Union, Bandhan, DBS, Utkarsh, and more.
- **USA**: Citi, Discover, Charles Schwab, Navy Federal, Huntington.
- **UAE**: FAB, ADCB, Emirates NBD, Liv, Mashreq.
- **Nepal**: Laxmi Sunrise, Everest, NMB, Nabil, Manjushree, Siddhartha.
- **Thailand**: Bangkok Bank, Kasikorn, SCB, Krungthai, Krungsri, TTB, GSB, BAAC, UOB, CIMB, KTC.
- **Ethiopia**: CBE, Telebirr, Zemen, Dashen.
- **Tanzania**: M-Pesa, Selcom Pesa, Tigo Pesa.
- **Pakistan**: Faysal Bank, Standard Chartered.
- **Iran**: Melli, Parsian.
- **Saudi Arabia**: Alinma (Arabic SMS).
- **Egypt**: CIB.
- **Kenya**: M-PESA.
- **Colombia**: Bancolombia.
- **Belarus**: Priorbank (Russian/Belarusian SMS).

[Request a missing bank](https://github.com/alzimerahmed/WhisperCoin/issues/new?template=bank_support_request.md)

## Contributing

Fork the repository, create a feature branch, and open a pull request. See [CONTRIBUTING.md](CONTRIBUTING.md) and [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for details.

## Roadmap

- Phase 2: README and content cleanup (in progress).
- Phase 3: CI, build, and developer experience improvements.
- Phase 4: Biometric lock, real-time SMS observer, search and filter, CSV/OFX/QIF export.
- Phase 5: Security, performance, accessibility, and anti-vibe-coding audit.

## Changelog

See [GitHub Releases](https://github.com/alzimerahmed/WhisperCoin/releases) for the changelog.

## License

GNU Affero General Public License v3.0 — see [LICENSE](LICENSE).

Maintained by [Alzimer Ahmed](mailto:alzimerahmed84@gmail.com).
