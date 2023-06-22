@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.learningapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.learningapp.R
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Register() {
    //val keybord= remember {
        //LocalSoftwareKeyboardController.current
    //}
    val _snackBar = remember {
        SnackbarHostState()
    }
    val coroutineScope= rememberCoroutineScope()
    val _emailTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _emailError = remember {
        mutableStateOf(false)
    }
    val _messageSnackBar = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _passWordTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _pasWordError = remember {
        mutableStateOf(false)
    }
    Scaffold(snackbarHost={ SnackbarHost(hostState = _snackBar)}) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_signin), contentDescription = ""
                )
            }

            TextField(
                modifier = Modifier.padding(0.dp, 10.dp),
                value = _emailTextFieldValue.value,
                onValueChange = {
                    _emailTextFieldValue.value = it
                },
                placeholder = {
                    Text(text = "Email")
                }, isError = _emailError.value
            )

            TextField(
                modifier = Modifier.padding(0.dp, 10.dp),
                value = _passWordTextFieldValue.value,
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = {
                    _passWordTextFieldValue.value = it
                },
                placeholder = {
                    Text(text = "Mot de passe")
                }, isError = _pasWordError.value
            )
            Button(onClick = {
                _pasWordError.value = (_passWordTextFieldValue.value.text.length < 6)

                _emailError.value = (_emailTextFieldValue.value.text == "" )
                if (!_emailError.value && !_pasWordError.value) {
                    val firebaseAuth = Firebase.auth;
                    firebaseAuth.createUserWithEmailAndPassword(
                        _emailTextFieldValue.value.text, _passWordTextFieldValue.value.text
                    ).addOnCompleteListener {
                        if (it.isSuccessful) {

                        } else if (it.isCanceled) {}
                        else{
                            val emailErrorInvalid=(it.exception as FirebaseAuthInvalidCredentialsException).errorCode=="ERROR_INVALID_EMAIL";
                            _emailError.value=emailErrorInvalid;
                            coroutineScope.launch {
                                _snackBar.showSnackbar("not valid mail",null,false,SnackbarDuration.Short)
                            }
                            //keybord.current=false

                        }
                    }
                }
            }
            ) {
                Text(text = "Enregistrer")
            }
        }
    }
}


