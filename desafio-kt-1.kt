enum class Level { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String) 

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
            inscritos.add(usuario)
            println("$usuario foi matriculado da formação: $nome")
    }

    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
        println("$usuario foi desmatriculado da formação: $nome")
    }
}

fun main() {
    val contEdu1 = ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial", 60)
    val contEdu2 = ConteudoEducacional("Princípios de Interface de Usuário e Layouts Android", 120)
    val contEdu3 = ConteudoEducacional("Visão Geral Sobre o Android Jetpack", 120)

    val formacao = Formacao("Desenvolvimento Android", listOf(contEdu1, contEdu2, contEdu3))
    
    val usuario1 = Usuario("Gabriel")
    val usuario2 = Usuario("Vanessa")
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    formacao.inscritos.forEach { println(it.nome) }
}
