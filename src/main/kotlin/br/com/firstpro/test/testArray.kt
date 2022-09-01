package br.com.firstpro.test

import java.math.BigDecimal

fun testArrayMethods(){
    val salaryArray = bigDecimalArray("1000.00", "2500.00", "220.00", "100.00")
    val growthSalaries = salaryArray.map { salary -> salary * "1.1".toBigDecimal() }
    println(growthSalaries)

    val total = growthSalaries.reduce { acc, value ->
        acc + value
    }

    val moreTotal = growthSalaries.fold(total) { acc, value ->
        acc + value
    }

    println(moreTotal)
    println(total)


    println(growthSalaries.sorted().take(3))
    println(growthSalaries.takeLast(3))
}

fun testArray() {
    val inValues = intArrayOf(1, 2, 4)

    for(da in inValues) {
        print(da)
    }

    println()

    inValues.forEach { data ->
        print(data)
    }

    println()

    inValues.forEachIndexed { index, data ->
        print(inValues[index])
    }

    println()

    val intArrayOf : IntArray = intArrayOf(3, 23, 53, 23, 747, 23)
    println(intArrayOf.max())

    println()

    println(intArrayOf.average())

    println(intArrayOf.all { it > 3 })
    println(intArrayOf.any { it > 3 })

    println(intArrayOf.filter { it > 45 })

    println(intArrayOf.find { it > 45 })
}

fun testRange() {
    val range : IntRange = 1..2
    val value : Int = 2
    for(d in range) {
        println(d)
    }

    if(value in range) {
        println("$value in ${range.toString()}")
    }


}

fun bigDecimalArray(vararg values : String): Array<BigDecimal> {
    return Array<BigDecimal>(values.size) { i ->
        values[i].toBigDecimal()
    }
}
