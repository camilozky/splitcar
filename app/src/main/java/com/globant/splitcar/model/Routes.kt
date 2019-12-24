package com.globant.splitcar.model

/**
 * Routes
 *
 * This is just an temp. hardcoded data sample, with Route objects
 *
 */

import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

val currentDate: String = SimpleDateFormat.getDateTimeInstance().format(Calendar.getInstance().time)
val routes: ArrayList<Route> = ArrayList()
val route1 = Route(
        1,
        "phillip.coombs@globant.com",
        "City Plaza Envigado",
        "Vizcaya",
        currentDate,
        "17:00",
        4,
    "", "", mutableListOf()
)
val route2 = Route(
        2,
        "claudia.acevedo@globant.com",
        "Manrique Central",
        "Vizcaya",
        currentDate,
        "16:30",
        4,
    "Av Regional, Parque norte, Jardín botánico, Est. Universidad UdeA, Campo Valdes, Manrique Central",
    "", mutableListOf()
)
val route3 = Route(
        3,
        "s.mejia@globant.com",
        "UPB",
        "Vizcaya",
        currentDate,
        "19:00",
        4,
    "Las palmas, Exposiciones, La 33 hasta la UPB (Laureles)", "", mutableListOf()
)

fun addRoutes(route: Route) {
    routes.add(route)
}

fun addAllRoutes(): ArrayList<Route> {
    routes.add(route1)
    routes.add(route2)
    routes.add(route3)
    return routes
}

fun showAllRoutes(): ArrayList<Route> {
    return routes
}
