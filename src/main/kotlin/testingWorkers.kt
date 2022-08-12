
    fun testingWorkers() {
        val alex = Analyst(
            name = "Alex",
            document = "111.111.111-11",
            salary = 1000.0
        )

        println("nome ${alex.name}")
        println("bonificação ${alex.extra}")

        val fran = Manager(
            name = "Fran",
            document = "222.222.222-22",
            salary = 2000.0,
            password = 1234
        )

        println("nome ${fran.name}")
        println("bonificação ${fran.extra}")

        if (fran.authenticate(1234)) {
            println("autenticou com sucesso")
        } else {
            println("falha na autenticação")
        }

        val gui = Director(
            name = "Gui",
            document = "333.333.333-33",
            salary = 4000.0,
            password = 4000,
            plr = 200.0
        )

        println("nome ${gui.name}")
        println("bonificação ${gui.extra}")
        println("plr ${gui.plr}")

        if (gui.authenticate(4000)) {
            println("autenticou com sucesso")
        } else {
            println("falha na autenticação")
        }

        val maria = Analyst(
            name = "Maria",
            document = "444.444.444-44",
            salary = 3000.0
        )

        println("bonificação ${maria.extra}")
        val calculadora = Calculator()
        calculadora.registra(alex)
        calculadora.registra(fran)
        calculadora.registra(gui)
        calculadora.registra(maria)

        println("total de bonificação: ${calculadora.total}")
    }
