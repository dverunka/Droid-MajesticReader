package com.raywenderlich.android.majesticreader.usecases.bookmarks

import BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Document

class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}