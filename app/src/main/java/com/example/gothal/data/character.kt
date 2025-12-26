package com.example.gothal.data

import androidx.room.Entity
import androidx.room.PrimaryKey

//Data class for containing all the data about a character.
//Consider subclassing out elements of the character sheet depending on how the pages break down.
//TODO - give this class the rest of its fields.
@Entity
data class character(
    @PrimaryKey val id: Int,

    val name: String
)