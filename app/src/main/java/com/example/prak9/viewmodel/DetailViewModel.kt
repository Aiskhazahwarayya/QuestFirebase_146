package com.example.prak9.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.prak9.modeldata.Siswa
import com.example.prak9.repositori.RepositorySiswa

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(savedStateHandle: SavedStateHandle, private val repositorySiswa: RepositorySiswa)
    : ViewModel() {

}