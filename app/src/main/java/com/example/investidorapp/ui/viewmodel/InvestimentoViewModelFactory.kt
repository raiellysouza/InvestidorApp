package com.example.investidorapp.ui.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class InvestimentosViewModelFactory(
    private val application: Application
) : ViewModelProvider.AndroidViewModelFactory(application) {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InvestimentosViewModel::class.java)) {
            return InvestimentosViewModel(application) as T
        }
        throw IllegalArgumentException("Classe desconhecida: $modelClass")
    }
}
