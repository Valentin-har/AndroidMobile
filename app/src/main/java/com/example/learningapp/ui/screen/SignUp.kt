package com.example.learningapp.ui.screen

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import com.example.learningapp.ui.screen.Register
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import com.example.learningapp.MainActivity
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.learningapp.R
import com.example.learningapp.ui.theme.LearningAppTheme
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(){
    val _snackBar = remember {
        SnackbarHostState()
    }
    val coroutineScope= rememberCoroutineScope()

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

    Scaffold(snackbarHost={ SnackbarHost(hostState = _snackBar) }){
        Column(modifier = Modifier
            .padding(it)
            .fillMaxSize()
            , verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_signin),
                    contentDescription = ""
                )
            }

            TextField(modifier = Modifier.padding(0.dp,10.dp),value = _emailTextFieldValue.value, onValueChange = {
                _emailTextFieldValue.value = it
            },
                placeholder = {
                    Text(text = "Email")
                }, isError = _emailError.value)

            TextField(modifier = Modifier.padding(0.dp,10.dp),value = _passwordTextFieldValue.value, visualTransformation = PasswordVisualTransformation(),onValueChange = {
                _passwordTextFieldValue.value = it
            },
                placeholder = {
                    Text(text = "Mot de passe")
                }, isError = _pasWordError.value)


            Button(onClick = {
                _pasWordError.value = (_passwordTextFieldValue.value.text.length < 6)

                _emailError.value = (_emailTextFieldValue.value.text == "" )
                if (!_emailError.value && !_pasWordError.value) {
                    val firebaseAuth = Firebase.auth;
                    firebaseAuth.signInWithEmailAndPassword(
                        _emailTextFieldValue.value.text, _passwordTextFieldValue.value.text
                    ).addOnCompleteListener {
                        if (it.isSuccessful) {

                        } else if (it.isCanceled) {}
                        else{
                            val emailErrorInvalid=(it.exception as FirebaseAuthInvalidCredentialsException).errorCode=="ERROR_INVALID_EMAIL";
                            _emailError.value=emailErrorInvalid;
                            coroutineScope.launch {
                                _snackBar.showSnackbar("not valid mail",null,false,
                                    SnackbarDuration.Short)
                            }
                            //keybord.current=false

                        }
                    }
                }
            }){
                Text(text = "connection")
            }
            Button(onClick = {

                }



            ){
                Text(text = "S'enregistrer ?");
            }
    }}
}