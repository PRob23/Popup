package com.robertpapp.popup.presentation.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.robertpapp.popup.presentation.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PopupGenyoScreen(
    title: String = stringResource(id = R.string.app_name),
    onBackButtonClicked: (() -> Unit)? = null,
    screenContent: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = title)
                },
                navigationIcon = onBackButtonClicked?.let {
                    {
                        IconButton(onClick = onBackButtonClicked) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = stringResource(id = R.string.navigate_back_content_description)
                            )
                        }
                    }
                }
            )
        },
        content = screenContent
    )
}
