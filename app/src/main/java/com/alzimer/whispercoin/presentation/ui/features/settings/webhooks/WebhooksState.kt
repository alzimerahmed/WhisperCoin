package com.alzimer.whispercoin.presentation.ui.features.settings.webhooks

import com.alzimer.whispercoin.data.database.entity.WebhookLogEntity
import com.alzimer.whispercoin.data.database.entity.WebhookProfileEntity
import com.alzimer.whispercoin.data.webhook.WebhookSettings

data class WebhooksUiState(
    val profiles: List<WebhookProfileEntity> = emptyList(),
    val logs: List<WebhookLogEntity> = emptyList(),
    val settings: WebhookSettings = WebhookSettings(),
    val settingsLoaded: Boolean = false,
    val isSyncing: Boolean = false,
    val message: String? = null
)
