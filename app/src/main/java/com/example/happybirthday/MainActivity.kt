package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = "Happy Birthday Radha", from = "From Gauri")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message : String, from : String, modifier : Modifier = Modifier){

    Column(
        verticalArrangement = Arrangement.Center,

    ) {
        Text(
            text = message,
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            lineHeight = 10.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }

}

@Composable
fun GreetingImage(message : String, from : String, modifier : Modifier = Modifier){
    val image = painterResource(R.drawable.whatsapp_image_2024_08_21_at_5_42_48_pm)
    Box(modifier) {

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 0.5F,
            modifier = Modifier.align(alignment = Alignment.Center)
        )
        GreetingText(
            message = "Happy Birthday Radha!",
            from = "From Gauri" ,
            modifier = Modifier.padding(8.dp).align(alignment = Alignment.Center),

        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
    GreetingImage(message = "Happy Birthday Sam", from = "From Emma")
    }
}