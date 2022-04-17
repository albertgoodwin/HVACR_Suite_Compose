package com.example.hvacrsuite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.hvacrsuite.ui.theme.HVACRSuiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HVACRSuiteTheme {
                // A surface container using the 'background' color from the theme

              //  Surface(
               //     modifier = Modifier.fillMaxSize(),
               //     color = MaterialTheme.colors.background
               // ) {
                    MyScaffold()
               // }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun MyScaffold() {
    Scaffold (
        topBar = { TopAppBar(title = {Text(stringResource(id = R.string.app_name))})})
    {
        //Greeting(name = "Dangle")



    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HVACRSuiteTheme {
        Greeting("Android")
    }

    MyScaffold()

}