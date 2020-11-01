import com.raywenderlich.android.majesticreader.domain.Document

class DocumentRepository(
        private val documentDataSource: IDocumentDataSource,
        private val openDocumentDataSource: IOpenDocumentDataSource) {

    suspend fun addDocument(document: Document) = documentDataSource.add(document)

    suspend fun getDocuments() = documentDataSource.readAll()

    suspend fun removeDocument(document: Document) = documentDataSource.remove(document)

    fun setOpenDocument(document: Document) = openDocumentDataSource.setOpenDocument(document)

    fun getOpenDocument() = openDocumentDataSource.getOpenDocument()
}