package com.kolappan.personalpettagam.data.family

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "family_members")
data class FamilyMemberEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val relation: String
)
