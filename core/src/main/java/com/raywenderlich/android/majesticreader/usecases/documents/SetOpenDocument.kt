package com.raywenderlich.android.majesticreader.usecases.documents

import DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class SetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}