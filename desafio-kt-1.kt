enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuários(val nome: String, val id: Int) {
    fun matricular(usuario: Usuários) {
        val usuarios = mutableListOf<Usuários>()
            usuarios.add(usuario)
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

    val contEdu1 = ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial", 60)
    val contEdu2 = ConteudoEducacional("Princípios de Interface de Usuário e Layouts Android", 120)
    val contEdu3 = ConteudoEducacional("Visão Geral Sobre o Android Jetpack", 120)

data class Formação(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val formacao = Formação("Desenvolvimento Android", listOf(contEdu1, contEdu2, contEdu3))
}

fun main() {
    val usuarios = Usuários("mopa,", 1)
    
    usuarios.matricular(usuarios)
    println(usuarios)
}