package com.example.weatherapp

import android.graphics.Paint.Align
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        Greeting("Android")
    }
}

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "WEATHER APP",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,

            )

        Spacer(modifier = Modifier.padding(13.dp))

        Box1()

        Spacer(modifier = Modifier.padding(13.dp))

        Location()

        Spacer(modifier = Modifier.padding(13.dp))

        Box2()

    }
}

@Composable
fun Box1() {
    val img = painterResource(id = R.drawable.img)

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.blueOcean))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = img,
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Text(
                text = "Rain",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(13.dp)
            )
        }
    }


}

@Composable
fun Location() {
    Text(text = "19°C", fontSize = 64.sp, fontWeight = FontWeight.Bold)
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        androidx.compose.foundation.Image(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = "",
            modifier = Modifier.size(35.dp)
        )
        Spacer(modifier = Modifier.padding(3.dp))
        Text(text = "Yogyakarta", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }

    Spacer(modifier = Modifier.padding(13.dp))

    Text(
        text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        color = Color.Gray
    )

}

@Composable
fun Box2() {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.blueOcean))
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                    Text(text = "Humidity")
                    Text(text = "98%", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                    Text(text = "UV Index")
                    Text(text = "9 / 10", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }

            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Sunrise")
                    Text(text = "05.00 AM", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Text(text = "Sunset")
                    Text(text = "05.40 AM", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
            }


        }
    }

}


