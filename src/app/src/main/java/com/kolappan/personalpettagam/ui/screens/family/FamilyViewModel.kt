package com.kolappan.personalpettagam.ui.screens.family

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.kolappan.personalpettagam.data.AppDatabase
import com.kolappan.personalpettagam.data.family.FamilyMemberEntity
import com.kolappan.personalpettagam.data.family.FamilyRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class FamilyViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FamilyRepository

    init {
        val dao = AppDatabase.getDatabase(application).familyMemberDao()
        repository = FamilyRepository(dao)
    }

    val members: StateFlow<List<FamilyMemberEntity>> = repository.allMembers
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun addMember(name: String, relation: String) {
        viewModelScope.launch {
            repository.insert(FamilyMemberEntity(name = name, relation = relation))
        }
    }
}
