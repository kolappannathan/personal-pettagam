package com.kolappan.personalpettagam.enums

enum class FamilyRelation(val displayName: String) {
    SPOUSE("Spouse"),
    MOTHER("Mother"),
    FATHER("Father"),
    DAUGHTER("Daughter"),
    SON("Son"),
    FATHER_IN_LAW("Father In Law"),
    MOTHER_IN_LAW("Mother In Law"),
    BROTHER("Brother"),
    SISTER("Sister"),
    UNCLE("Uncle"),
    AUNT("Aunt"),
    BROTHER_IN_LAW("Brother In Law"),
    SISTER_IN_LAW("Sister in Law"),
    GRAND_MOTHER("Grand Mother"),
    GRAND_FATHER("Grand Father"),
    GRAND_DAUGHTER("Grand Daughter"),
    GRAND_SON("Grand Son"),
    NEPHEW("Nephew"),
    NIECE("Niece"),
    COUSIN("Cousin")
}

data class FamilyMember(
    val name: String,
    val relation: String
)
