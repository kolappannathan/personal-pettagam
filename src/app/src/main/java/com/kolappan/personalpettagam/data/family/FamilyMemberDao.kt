package com.kolappan.personalpettagam.data.family

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FamilyMemberDao {
    @Query("SELECT * FROM family_members")
    fun getAllMembers(): Flow<List<FamilyMemberEntity>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertMember(member: FamilyMemberEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateMember(member: FamilyMemberEntity)

    @Delete
    suspend fun deleteMember(member: FamilyMemberEntity)
}
