package com.example.hvacrsuite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.constraintlayout.compose.ConstraintLayout
import com.example.hvacrsuite.ui.theme.HVACRSuiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HVACRSuiteTheme {
                    MyScaffold()
            }
        }
    }
}

@Composable
fun MyScaffold() {
    Scaffold (
        topBar = { TopAppBar(title = {Text(stringResource(id = R.string.app_name))})})
    {
        //Greeting(name = "Dangle")

        Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize() )
        {
            Button(onClick = { /*TODO*/ },
            Modifier.padding(16.dp)
            ) {
                Text(stringResource(id = R.string.capacitor_calculator_btn))
            }
        }



    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HVACRSuiteTheme {
        MyScaffold()
    }



}