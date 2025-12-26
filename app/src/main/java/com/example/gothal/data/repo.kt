package com.example.gothal.data

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Use object to enforce a singleton pattern.
object Repo{
    var db: AppDB? = null

    //Creates a db if one doesn't exist.
    fun getDB(ctx: Context): AppDB? {
        if(db == null){
            db = Room.databaseBuilder(
                ctx,
                AppDB::class.java,
                "db_name"
            ).build()
        }
        return db
    }
}

//Abstract DB class.
@Database (entities = [character::class], version = 1)
abstract class AppDB: RoomDatabase(){
    abstract fun getDao(): CharacterDao
}

//Interface to interact with the DB.
//TODO - Define core DB operations.
@Dao
interface CharacterDao{

}
