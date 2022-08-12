package br.com.firstpro.model

class Calculator {
        var total: Double = 0.0
            private set

        fun registra(funcionario: Worker){
            this.total += funcionario.extra
        }

}