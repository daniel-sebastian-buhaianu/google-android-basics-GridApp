package com.example.gridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic (
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val iconResourceId: Int,
    @StringRes val titleStringResourceId: Int,
    @StringRes val numberStringResourceId: Int
    )