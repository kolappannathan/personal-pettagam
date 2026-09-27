package com.kolappan.personalpettagam.data.family

import kotlinx.coroutines.flow.Flow

class FamilyRepository(private val dao: FamilyMemberDao) {
    val allMembers: Flow<List<FamilyMemberEntity>> = dao.getAllMembers()

    suspend fun insert(member: FamilyMemberEntity) {
        dao.insertMember(member)
    }

    suspend fun update(member: FamilyMemberEntity) {
        dao.insertMember(member)
    }

    suspend fun delete(member: FamilyMemberEntity) {
        dao.deleteMember(member)
    }
}
