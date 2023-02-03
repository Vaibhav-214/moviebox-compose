package com.majorkik.core.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.majorkik.core.ui.R
import com.majorkik.core.ui.theme.MovieBoxTheme

@Composable
@DrawableRes
fun getPopcornPlaceholderResId(isLight: Boolean = MovieBoxTheme.colors.isLight) = if (isLight) {
    R.drawable.bg_placeholder_popcorn_light
} else {
    R.drawable.bg_placeholder_popcorn_dark
}

@Composable
fun getSmallProfilePlaceholder(isLight: Boolean = MovieBoxTheme.colors.isLight) = if (isLight) {
    painterResource(id = R.drawable.placeholder_profile_small_light)
} else {
    painterResource(id = R.drawable.placeholder_profile_small_dark)
}
