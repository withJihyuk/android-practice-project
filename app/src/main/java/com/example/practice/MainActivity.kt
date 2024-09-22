package com.example.practice
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice.ui.theme.PracticeTheme
import kotlin.math.round

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
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
        MenuBar()
        HorizontalDivider()
        Conversion()
    }
}


@Composable
fun Topbar() {
    Surface {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
                TextField(value = "⚡ 링크로 옷 가져오기",
                    onValueChange = {},
                    modifier = Modifier
                        .weight(1f)
                        .height(54.dp)
                    ,
                    trailingIcon = {Icon(Icons.Rounded.Add, contentDescription = "검색")},
                    shape = RoundedCornerShape(6.dp),
                    colors = TextFieldDefaults.colors().copy(
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedContainerColor = Color(0xFFF5F5F5),
                        unfocusedContainerColor = Color(0xFFF5F5F5),
                    )
                )
                Text(text ="설정",
                    modifier = Modifier
                        .wrapContentWidth()
                        .padding(start = 20.dp))
        }
    }
}

@Composable
fun MenuBar() {
    Surface {
        Row(horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            TextButton(onClick = {}) {
                Text(text = "변환하기")
            }
            TextButton(onClick = {}) {
                Text(text = "장바구니")
            }
        }
    }
}

@Composable
fun Conversion() {
    Surface {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "안드로이드 아이콘"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true) // 여기서 showSystemUi를 통해 전체 휴대폰 모양으로 보여줄지 말지 선택할 수 있음
@Composable
fun GreetingPreview() {
    PracticeTheme {
        FullScreen()
    }
}