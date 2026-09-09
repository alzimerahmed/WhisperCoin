package com.alzimer.whispercoin.di

import com.alzimer.whispercoin.data.repository.RuleRepositoryImpl
import com.alzimer.whispercoin.domain.repository.RuleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RuleModule {

    @Binds
    @Singleton
    abstract fun bindRuleRepository(
        ruleRepositoryImpl: RuleRepositoryImpl
    ): RuleRepository
}