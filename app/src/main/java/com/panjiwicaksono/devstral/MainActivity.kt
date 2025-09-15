package com.panjiwicaksono.devstral

import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.panjiwicaksono.devstral.ui.theme.JuggernautTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JuggernautTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingText(message = "Selamat Ulang Tahun Cihuyy", from = " From Panjuy")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String){
    val image = painterResource(R.drawable.androds)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        )
        GreetingText(
            message = message,
            from = from,

        )
    }
}

@Composable
fun GreetingText(message: String, from: String , modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(10.dp)
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(top = 100.dp)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = modifier
                .padding()
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun JetpackComposeTutorial(images: String, text: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Box{
        Image(
            painter = image,
            contentDescription = null
        )
    }
}


@Preview(
    showBackground = true,
   // name = "Panji Wicaksono",
   // showSystemUi = true
)

@Composable
fun GreetingPreview() {
    JuggernautTheme {
        GreetingText(message = stringResource(R.string.ucapan_selamat_ulang_tahun), stringResource(
            R.string.signature_text
        ))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingImagePreview() {
    JuggernautTheme {
        GreetingImage(
            stringResource(R.string.ucapan_selamat_ulang_tahun),
            stringResource(R.string.signature_text)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun JetpackCompose(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    val h1 = stringResource(R.string.text_jetpack_compose)
    val h2 = stringResource(R.string.isi_1)
    val h3 = stringResource(R.string.isi_1)

    Column { 
        Image(
            painter = image,
            null,
            modifier
                .padding(top = 30.dp)
        )
        Text(
            text = h1,
            fontSize = 24.sp,
            modifier = modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        )
        Text(
            text = h2,
            modifier = modifier
                .padding(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp,
                bottom = 16.dp)
                .align(Alignment.End),
            textAlign = TextAlign.Justify
        )
        Text(
            text = h2,
            modifier = modifier
                .padding(
                    top = 16.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ),

            textAlign = TextAlign.Justify
        )
    }
}