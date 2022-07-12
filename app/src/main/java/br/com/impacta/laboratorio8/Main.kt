package br.com.impacta.laboratorio8

fun main() {
    var arrayNomes: Array<String> = arrayOf("Alexandre", "Cainã", "Diego", "Fernando", "José Carlos", "Luana", "Raquel", "Rubiane", "Vitor")
    var arrayNotas: Array<Double> = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0)

    imprimeNomesNotas(arrayNomes, arrayNotas)
}

fun imprimeNomesNotas(nomes:Array<String>, notas: Array<Double>) {
    for (i in nomes.indices) {
        println("Nome: ${nomes[i]}, nota: ${notas[i]}")
    }
}