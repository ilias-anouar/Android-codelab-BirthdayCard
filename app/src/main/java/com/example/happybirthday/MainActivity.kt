package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

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
                    GreetingText(
                        getString(R.string.happy_birthday),
                        getString(R.string.happy_birthday_ilias) + getString(R.string.happy_birthday_src),
                        getString(
                            R.string.date
                        ),Modifier.padding(24.dp))
                }
            }
        }
    }
}

@Composable
fun GreetingText(main : String,message: String,date:String ,modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.birthday_card_layout_android__1_)
    Surface (color=Color.Cyan) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Text(
                text = main,
                fontSize = 40.sp,
                lineHeight = 10.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = message,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
           Image(
               painter =image,
               contentDescription = "party",
               contentScale = ContentScale.Crop,
               modifier = Modifier
                   .align(alignment = Alignment.CenterHorizontally)
                   .size(500.dp)
           )
            Text(
                text = date,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }
    }
}

//@Composable
//fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {}

@Preview(showBackground = true,name="my preview",/* showSystemUi = true */)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText("Happy Birthday","Happy birthday ilias,\n" + " wish u a nice and good life","08/07/2001",Modifier.padding(24.dp))
    }
}