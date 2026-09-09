package com.alzimer.whispercoin.presentation.ui.features.settings.rules

import com.alzimer.whispercoin.domain.usecase.BatchApplyResult

data class RulesUiState(
    val isLoading: Boolean = false,
    val batchApplyProgress: Pair<Int, Int>? = null,
    val batchApplyResult: BatchApplyResult? = null
)
