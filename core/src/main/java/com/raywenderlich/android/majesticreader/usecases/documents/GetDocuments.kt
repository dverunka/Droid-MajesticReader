package com.raywenderlich.android.majesticreader.usecases.documents

import DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke() = documentRepository.getDocuments()
}