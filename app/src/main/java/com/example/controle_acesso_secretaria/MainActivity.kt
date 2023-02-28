package com.example.controle_acesso_secretaria

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.controle_acesso_secretaria.ui.theme.Controle_Acesso_SecretariaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
    }

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        topBar = { MyTopBar() },
        bottomBar = { MyBottomBar()}) {
        MyScreenContent()
    }
}
@Composable
fun MyScreenContent(){
    Box(modifier = Modifier
        .fillMaxSize().background(color = Color.Yellow)){
        Text(text = "Learning Jetpack Compose")
    }
}



@Composable
fun MyTopBar(){
    TopAppBar() {
        Text(text = "Controle Acesso Seretaria")
        
    }
}
@Composable
fun MyBottomBar(){
    BottomAppBar(modifier = Modifier
        .fillMaxWidth(), backgroundColor = Color.Red) {
        Text(text = "Bottom bar")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()

}