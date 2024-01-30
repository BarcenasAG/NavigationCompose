package com.example.navigationcompose.ui.theme.model


sealed class Routes (val route:String) {
    object Pantalla1:Routes("screen1")
    object Pantalla2:Routes("screen2")
    object Pantalla3:Routes("screen3")
    object Pantalla4:Routes("pantalla4/{age}"){
        fun createRoute(age:Int) = "pantalla4/$age"
    }
    object Pantalla5:Routes("pantalla5?name={name}"){
        fun createRoute(name:String) = "pantalla5?name=$name"
    }
}
