package com.example.learningapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(){

    val _emailTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    Scaffold() {
        Column(modifier = Modifier.padding(it)) {
            TextField(value = _emailTextFieldValue.value, onValueChange = {
                _emailTextFieldValue.value = it
            },
            placeholder = {
                Text(text = "Je suis un placeholder")
            })
        }
    }
}