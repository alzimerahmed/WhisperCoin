package com.alzimer.whispercoin.domain.usecase

import android.util.Log
import com.alzimer.whispercoin.data.database.entity.SubscriptionEntity
import com.alzimer.whispercoin.data.repository.SubscriptionRepository
import javax.inject.Inject

class UpdateSubscriptionUseCase
@Inject
constructor(private val subscriptionRepository: SubscriptionRepository) {
    suspend fun execute(subscription: SubscriptionEntity) {
        Log.d("UpdateSubscriptionUseCase", "Updating subscription entity: ${subscription.id}")
        subscriptionRepository.updateSubscription(subscription)
        Log.d("UpdateSubscriptionUseCase", "Subscription updated successfully.")
    }
}
