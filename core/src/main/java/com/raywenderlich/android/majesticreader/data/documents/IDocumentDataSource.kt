import com.raywenderlich.android.majesticreader.domain.Document

interface IDocumentDataSource {

    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)
}