package com.kolappan.personalpettagam.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kolappan.personalpettagam.data.family.FamilyMemberDao
import com.kolappan.personalpettagam.data.family.FamilyMemberEntity

@Database(entities = [FamilyMemberEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun familyMemberDao(): FamilyMemberDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "personal_pettagam_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
