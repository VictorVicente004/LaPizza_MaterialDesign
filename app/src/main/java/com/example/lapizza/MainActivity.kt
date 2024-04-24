package com.example.lapizza

import android.content.Intent
import android.content.res.Resources.Theme
import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lapizza.ui.theme.LaPizzaTheme
import com.example.lapizza.ui.theme.background80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaPizzaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = background80
                ) {
                    MyScreenContent()
                }
            }
        }
    }
 }

@Composable
fun MyScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "LA PIZZA",
            style = TextStyle(fontSize = 40.sp,
                color = Color.White),
           //     fontFamily = ), BUSCANDO SOBRE
            modifier = Modifier
                .padding(16.dp)
                .offset(x = 0.dp, y = 100.dp)
        )

                Text(text = "AQUELA QUE VOCÊ AMA",
                style = TextStyle(fontSize = 20.sp,
                    color = Color.White),
                        modifier = Modifier
                        .padding(1.dp)
                    .offset(x = 0.dp, y = 100.dp)
                )

        Image(
            painter = painterResource(id = R.drawable.calabresa),
            contentDescription = "calabresa",
            modifier = Modifier
                .size(300.dp) // Tamanho da imagem
                .padding(1.dp) // Espaçamento ao redor da imagem
                .offset(x = -100.dp, y = 380.dp) // Posição da imagem 10dp para a direita e 40dp para baixo

        )
        Image(painter = painterResource(id = R.drawable.frango),
            contentDescription = "frango",
            modifier = Modifier
                .size(200.dp)
                .padding(1.dp)
                .offset(x = 40.dp, y = 150.dp)
        )

    }

}
// O @Preview serve para visualizar a tela antes de renderizar no aplicativo

@Preview(showBackground = true,
        showSystemUi = true,
        name = "MyPreview"
)
@Composable
fun MyScreenContentPreview() {
    MyScreenContent()
    }

