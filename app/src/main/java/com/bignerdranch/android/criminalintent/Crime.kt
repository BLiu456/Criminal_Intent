package com.bignerdranch.android.criminalintent

import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

data class Crime(
    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
)
