package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.usecases.bookmarks.*
import com.raywenderlich.android.majesticreader.usecases.documents.*

data class UseCases(
        val addBookmark: AddBookmark,
        val getBookmarks: GetBookmarks,
        val deleteBookmark: RemoveBookmark,
        val addDocument: AddDocument,
        val getDocuments: GetDocuments,
        val removeDocument: RemoveDocument,
        val getOpenDocument: GetOpenDocument,
        val setOpenDocument: SetOpenDocument
)
