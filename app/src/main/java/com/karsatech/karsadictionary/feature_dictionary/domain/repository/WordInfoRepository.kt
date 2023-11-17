package com.karsatech.karsadictionary.feature_dictionary.domain.repository

import com.karsatech.karsadictionary.core.util.Resource
import com.karsatech.karsadictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}