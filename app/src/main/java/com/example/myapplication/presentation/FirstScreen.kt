package com.example.myapplication.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Preview
@Composable
fun Element(){
    Column (
        modifier = Modifier
            .background(color = Color.Gray)
            .padding(10.dp)
    ) {
        for (i in 0..5){
            todoItem(Modifier.fillMaxSize())
            Spacer(modifier = Modifier.size(9.dp))
        }
    }
}

@Composable
fun todoItem(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .width(300.dp)
            .height(140.dp)
            .background(color = Color.White)
            .padding(15.dp)
            .clip(shape = RoundedCornerShape(15.dp/*, 15.dp, 0.dp, 0.dp*/)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Column(
            verticalArrangement = Arrangement.Center,

            ) {
            Text(
                text = "TODO TITLE",
                color = Color.Green,
                fontSize = 19.sp)
            Text("TODO TITLE")
        }

        Row(){

            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Delete"
            )
            Spacer(modifier = Modifier.size(20.dp))
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Delete"
            )
            Spacer(modifier = Modifier.size(20.dp))
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = "Delete"
            )
        }

    }

}

@Composable
fun FirstSccreen (

    navController: NavController

) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
                
        ) {
            Button(onClick = {
                navController.navigate(Screen.SecondSccreen.route)
            }) {
                Text(text = "Sfhsgjnsaz")
            }
        }
    }
    
}

@Composable
fun SecondSccreen (

    navController: NavController

) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Text(text = "sdgnsazhmya")
            }
        }
    }

}

sealed class Screen(val route: String) {
    object FirstSccreen : Screen("first")
    object SecondSccreen : Screen("second")
}