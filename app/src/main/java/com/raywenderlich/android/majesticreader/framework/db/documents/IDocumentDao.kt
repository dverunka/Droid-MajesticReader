package com.raywenderlich.android.majesticreader.framework.db.documents

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert

import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface IDocumentDao {

    @Insert(onConflict = REPLACE)
    suspend fun addDocument(document: DocumentEntity)

    @Query("SELECT * FROM document")
    suspend fun getDocuments(): List<DocumentEntity>

    @Delete
    suspend fun removeDocument(document: DocumentEntity)
}
