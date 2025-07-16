package com.aristidevs.androidmaster.sintaxis

fun main(){
    inmutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekDays.add(3,"AristiDay")
    println(weekDays)

//    if(weekDays.isEmpty()){
//        //No voy a pintar nada porque no hay
//    }else{
//        weekDays.forEach { println(it) }
//    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    val last = weekDays.last()
    println("El último día de la semana es: $last")

//    for(SUSCRIBETE in weekDays){
//
//    }

//    weekDays.forEach { it -> println(it) }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

//    Filtrar
    val example = readOnly.filter { it.contains("a")  }
    println(example)

    //Iterar
    readOnly.forEach { println(it) }
}