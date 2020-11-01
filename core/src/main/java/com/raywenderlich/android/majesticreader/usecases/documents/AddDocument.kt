package com.raywenderlich.android.majesticreader.usecases.documents

import DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)

}