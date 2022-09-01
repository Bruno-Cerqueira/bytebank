package br.com.firstpro.test

fun main() {
    testMap()
}

fun testingDistinct() {
    val androidStudents: List<String> = listOf("Alex", "Fran")
    val kotlinStudents: List<String> = listOf("Alex", "Aran")
    val sumStudents = androidStudents + kotlinStudents
    val mutData: MutableList<String> = mutableListOf<String>()
    mutData.addAll(androidStudents)
    mutData.addAll(kotlinStudents)
    println(sumStudents.distinct())
    println(mutData.distinct())
}

fun testingSet(){
    val androidStudents: Set<String> = setOf("Alex", "Fran")
    val kotlinStudents: Set<String> = setOf("Alex", "Aran")
    val allStudents: MutableSet<String> = mutableSetOf<String>()
    allStudents.addAll(androidStudents)
    allStudents.addAll(kotlinStudents)
    allStudents.add("Ana")
    allStudents.add("Ana")
    println(allStudents)

    println(androidStudents + kotlinStudents)
    println(androidStudents union(kotlinStudents))

    println(androidStudents - kotlinStudents)
    println(androidStudents subtract(kotlinStudents))

    println(androidStudents intersect kotlinStudents)

    val assList = allStudents.toMutableList()
    assList.add("Alex")
    println(assList)
    println(assList.toSet())
}

fun testMap(){
    val orders : Map<Int, Double?> = mapOf(Pair(1, 20.0), Pair(2, 220.0), 3 to 50.0, 4 to null)
    println(orders)
    println(orders[1])
    val order: Double? = orders[0]
    order.let {ord: Double? ->
        println("pedido $ord")
    }

    for(ord: Map.Entry<Int, Double?> in orders) {
        println("Número pedido ${ord.key}, valor: ${ord.value}")
    }

    val ordersMutable : MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), Pair(2, 220.0), 3 to 50.0)
    ordersMutable[4] = 70.0
    println(ordersMutable)
    ordersMutable.put(5, 90.0)
    println(ordersMutable)
    ordersMutable.put(1, 40.0)
    println(ordersMutable)

    ordersMutable.putIfAbsent(1, 90.0)
    println(ordersMutable)
    ordersMutable.remove(2)
    ordersMutable.remove(1, 30.0)
    println(ordersMutable)
    ordersMutable.remove(1, 40.0)
    println(ordersMutable)

    orders.getOrElse(1) {
        "Nao tem pedido"
    }
    println(orders.get(4))
    println(orders.getValue(4))
    println(orders.get(5))
    //println(orders.getValue(5))

    println(orders.filter { (number, value) ->
        number % 2 == 0
    })

    println(orders.filterKeys { number ->
        number % 2 == 0
    })

    println(orders + Pair(80, 800.00))
    println(orders - Pair(80, 800.00))
    println(orders - 4)
    println(ordersMutable)
    ordersMutable += listOf(6 to 70.0)
    ordersMutable += Pair(9, 70.0)
    ordersMutable.putAll(listOf(10 to 70.0, Pair(11, 120.0)))
    println(ordersMutable)
    ordersMutable -= 9
    println(ordersMutable)

    val classOrders = listOf(
        Order(1, 20.0),
        Order(2, 40.0),
        Order(3, 230.0),
        Order(4, 60.0)
    )
    println(classOrders)

    val watchOrder = classOrders.associate { order: Order ->
        Pair(order.number, order)
    }

    println(watchOrder)

    val watchOrderBy = classOrders.associateBy { order: Order ->
        order.number
    }
    println(watchOrderBy)

    val watchOrderWith = classOrders.associateWith { order: Order ->
        order.number % 2 == 0
    }
    println(watchOrderWith)

    val groupOrder = classOrders.groupBy { order: Order ->
        order.value > 100
    }
    println(groupOrder)
}


class Order (val number: Int, val value: Double)