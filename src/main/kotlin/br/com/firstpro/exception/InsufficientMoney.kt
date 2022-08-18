package br.com.firstpro.exception

import java.lang.Exception

class InsufficientMoneyException(message: String = "Falha na autenticação"): Exception(message)