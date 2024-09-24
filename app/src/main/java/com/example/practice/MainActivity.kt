package com.example.practice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice.ui.theme.PracticeTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    FullScreen()
                }
            }
        }
    }
}

@Composable
fun FullScreen() {
    Column {
        Topbar()
        MainText()
        ShowTopImages()
    }
}


@Composable
fun Topbar() {
    Surface {
        Text(
            text = "ㅇㄱㅇㄸ", style = TextStyle(
                fontSize = 24.sp, fontWeight = FontWeight.Black
            )
        )
    }
}

@Composable
fun MainText() {
    Surface(
        modifier = Modifier
            .padding(top = 60.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "안녕하세요, 이지혁님",
                style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 24.sp)
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = "옷과 본인의 사진을 추가하여,\n실제 핏이 어떨지 확인해봐요!",
                style = TextStyle(
                    fontWeight = FontWeight.Thin,
                    color = Color.Gray,
                    fontSize = 20.sp
                )
            )
        }
    }
}

@Composable
fun ShowTopImages() {
    Surface(modifier = Modifier.padding(top = 50.dp)) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "이런 옷은 어떠세요?", style = TextStyle(fontSize = 20.sp))
                Icon(Icons.Rounded.PlayArrow, contentDescription = "바로가기")
            }
            Row {
//                Image(painter = , contentDescription = )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    PracticeTheme {
        FullScreen()
    }
}