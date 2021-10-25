package com.ryfazrin.mynotesapp.ui.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import com.ryfazrin.mynotesapp.database.Note
import com.ryfazrin.mynotesapp.repository.NoteRepository

class NoteAddUpdateViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun insert(note: Note) {
        mNoteRepository.insert(note)
    }

    fun update(note: Note) {
        mNoteRepository.update(note)
    }

    fun delete(note: Note) {
        mNoteRepository.delete(note)
    }
}