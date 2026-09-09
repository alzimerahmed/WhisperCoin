package com.alzimer.whispercoin.presentation.ui.features.settings.cloudbackup

import android.content.Intent
import com.alzimer.whispercoin.data.cloud.BackupSchedule
import com.alzimer.whispercoin.data.cloud.CloudFileInfo
import com.alzimer.whispercoin.data.cloud.CloudProviderConfig
import com.alzimer.whispercoin.data.cloud.CloudProviderType
import com.alzimer.whispercoin.data.cloud.SyncStatus

data class BackupSyncState(
    val activeProviderType: CloudProviderType = CloudProviderType.LOCAL_ONLY,
    val webDavConfig: CloudProviderConfig.WebDavConfig = CloudProviderConfig.WebDavConfig(),
    val googleDriveConfig: CloudProviderConfig.GoogleDriveConfig = CloudProviderConfig.GoogleDriveConfig(),
    val isGoogleDriveSignedIn: Boolean = false,
    val syncStatus: SyncStatus = SyncStatus.Idle,
    val backupSchedule: BackupSchedule = BackupSchedule.MANUAL,
    val retentionLimit: Int = 10,
    val isE2eEnabled: Boolean = false,
    val e2ePassphrase: String = "",
    val lastBackupTime: Long = 0L,
    val lastSyncTime: Long = 0L,
    val remoteSnapshots: List<CloudFileInfo> = emptyList(),
    val isLoadingSnapshots: Boolean = false,
    val connectionTestResult: String? = null,
    val isTestingConnection: Boolean = false,
    val recoverableAuthIntent: Intent? = null,
    val showRestorePassphraseDialog: Boolean = false,
    val restoreTargetFile: CloudFileInfo? = null
)
