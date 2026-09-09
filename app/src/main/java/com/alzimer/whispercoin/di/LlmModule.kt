package com.alzimer.whispercoin.di

import android.content.Context
import com.alzimer.whispercoin.data.service.LiteRtLmServiceImpl
import com.alzimer.whispercoin.domain.service.LlmService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LlmModule {

    @Provides
    @Singleton
    fun provideLlmService(
        @ApplicationContext context: Context
    ): LlmService {
        return LiteRtLmServiceImpl(context)
    }
}
