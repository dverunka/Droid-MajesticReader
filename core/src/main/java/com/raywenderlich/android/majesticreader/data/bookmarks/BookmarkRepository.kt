import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class BookmarkRepository(private val bookmarkDataSource: IBookmarkDataSource) {

    suspend fun addBookmark(document: Document, bookmark: Bookmark) = bookmarkDataSource.add(document, bookmark)

    suspend fun getBookmarks(document: Document) = bookmarkDataSource.read(document)

    suspend fun removeBookmark(document: Document, bookmark: Bookmark) = bookmarkDataSource.remove(document, bookmark)
} 