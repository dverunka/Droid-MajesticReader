package com.raywenderlich.android.majesticreader.usecases.documents

import DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke() = documentRepository.getOpenDocument()
}