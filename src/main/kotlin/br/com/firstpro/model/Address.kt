package br.com.firstpro.model

class Address(
    var name: String = "",
    var number: Number = 0,
    var zip: String = "",
) {
    override fun toString(): String {
        return "Address(name='$name', number=$number, zip='$zip')"
    }
}