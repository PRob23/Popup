package com.robertpapp.popup.presentation.main

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.robertpapp.popup.domain.model.PopupResult
import com.robertpapp.popup.presentation.R
import com.robertpapp.popup.presentation.components.PopupGenyoScreen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(
    state: MainScreenState,
    onTestButtonClicked: () -> Unit,
) {
    PopupGenyoScreen(
        title = stringResource(id = R.string.app_name)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 32.dp,
                    bottom = 16.dp
                )
        ) {
            Content(
                state,
                onTestButtonClicked
            )
        }
    }
}

@Composable
private fun ColumnScope.Content(
    state: MainScreenState,
    onTestButtonClicked: () -> Unit
) {
    Spacer(
        modifier = Modifier.weight(1.0f)
    )
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = stringResource(id = R.string.main_setup_screen_instruction_1),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.h5
    )
    Spacer(
        modifier = Modifier.weight(1.0f)
    )
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = when(state.popupResult) {
            PopupResult.OK -> stringResource(id = R.string.main_setup_screen_instruction_popup_ok)
            PopupResult.NOT_OK -> stringResource(id = R.string.main_setup_screen_instruction_popup_not_ok)
            null -> ""
        },
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.h5
    )
    Spacer(
        modifier = Modifier.weight(1.5f)
    )
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = onTestButtonClicked,
        enabled = state.isButtonEnabled
    ) {
        Text(
            text = stringResource(id = R.string.main_setup_screen_test)
        )
    }
}

@Preview()
@Composable
fun NotStartedPreview() {
    MainScreen(
        state = MainScreenState(popupResult = null),
        onTestButtonClicked = {}
    )
}

@Preview()
@Composable
fun OkPreview() {
    MainScreen(
        state = MainScreenState(popupResult = PopupResult.OK),
        onTestButtonClicked = {}
    )
}

@Preview()
@Composable
fun NotOkPreview() {
    MainScreen(
        state = MainScreenState(popupResult = PopupResult.NOT_OK),
        onTestButtonClicked = {}
    )
}


