package br.com.firstpro.model

interface Authenticate {
    fun authenticate(password: Int): Boolean
}