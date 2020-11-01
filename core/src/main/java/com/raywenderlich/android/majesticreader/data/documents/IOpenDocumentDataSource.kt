import com.raywenderlich.android.majesticreader.domain.Document

interface IOpenDocumentDataSource {

    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}