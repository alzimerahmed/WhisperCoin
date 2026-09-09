package com.alzimer.whispercoin.domain.usecase

import com.alzimer.whispercoin.data.database.entity.CategoryEntity
import com.alzimer.whispercoin.data.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(
    private val categoryRepository: CategoryRepository
) {
    fun execute(): Flow<List<CategoryEntity>> {
        return categoryRepository.getAllCategories()
    }
}