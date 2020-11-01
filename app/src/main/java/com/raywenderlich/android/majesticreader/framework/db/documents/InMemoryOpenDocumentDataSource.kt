import com.raywenderlich.android.majesticreader.domain.Document

class InMemoryOpenDocumentDataSource : IOpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument() = openDocument
}