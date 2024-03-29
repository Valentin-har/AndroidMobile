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
import androidx.navigation.NavHostController
import com.example.learningapp.R
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Login(_snackBar:SnackbarHostState, navController: NavHostController) {
    val coroutineScope = rememberCoroutineScope()

    val _emailTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _passwordTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _emailError = remember {
        mutableStateOf(false)
    }
    val _pasWordError = remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Connexion")
        IconButton(onClick = { }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_signin),
                contentDescription = ""
            )
        }

        TextField(modifier = Modifier.padding(0.dp, 10.dp),
            value = _emailTextFieldValue.value,
            onValueChange = {
                _emailTextFieldValue.value = it
            },
            placeholder = {
                Text(text = "Email")
            },
            isError = _emailError.value
        )

        TextField(modifier = Modifier.padding(0.dp, 10.dp),
            value = _passwordTextFieldValue.value,
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = {
                _passwordTextFieldValue.value = it
            },
            placeholder = {
                Text(text = "Mot de passe")
            },
            isError = _pasWordError.value
        )


        Button(onClick = {
            _pasWordError.value = (_passwordTextFieldValue.value.text.length < 6)

            _emailError.value = (_emailTextFieldValue.value.text == "")
            if (!_emailError.value && !_pasWordError.value) {
                val firebaseAuth = Firebase.auth;
                firebaseAuth.signInWithEmailAndPassword(
                    _emailTextFieldValue.value.text, _passwordTextFieldValue.value.text
                ).addOnCompleteListener {
                    if (it.isSuccessful) {

                        navController.navigate("home")
                    } else if (it.isCanceled) {
                    } else {
                        val emailErrorInvalid =
                            (it.exception as FirebaseAuthInvalidCredentialsException).errorCode == "ERROR_INVALID_EMAIL";
                        _emailError.value = emailErrorInvalid;
                        coroutineScope.launch {
                            _snackBar.showSnackbar(
                                "not valid mail", null, false,
                                SnackbarDuration.Short
                            )
                        }
                        //keybord.current=false

                    }
                }
            }
        }) {
            Text(text = "Connexion")
        }
        Button(onClick = {
            navController.navigate("register")
        }
        ) {
            Text(text = "S'enregistrer ?");
        }
    }
}