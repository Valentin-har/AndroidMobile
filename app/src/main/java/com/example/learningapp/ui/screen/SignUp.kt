package com.example.learningapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.learningapp.R
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(){

    val firebaseAuth = Firebase.auth
    val _emailTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _passwordTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }

    Scaffold{
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
                })

            TextField(modifier = Modifier.padding(0.dp,10.dp),value = _passwordTextFieldValue.value, visualTransformation = PasswordVisualTransformation(),onValueChange = {
                _passwordTextFieldValue.value = it
            },
                placeholder = {
                    Text(text = "Mot de passe")
                })


            Button(onClick = {
                if(_emailTextFieldValue.value.text == ""){

                }else if(_passwordTextFieldValue.value.text.length < 6){

                }else {
                    firebaseAuth
                        .createUserWithEmailAndPassword(
                            _emailTextFieldValue.value.text,
                            _passwordTextFieldValue.value.text
                        )
                        .addOnCompleteListener {
                            if (it.isSuccessful) {

                            } else if (it.isCanceled) {

                            }
                        }.addOnFailureListener {

                        }
                }
            }){
                Text(text = "Enregistrer")
            }
        }
    }
}