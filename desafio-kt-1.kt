enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuários(val nome: String, val id: Int) {
    fun matricular(usuario: Usuários) {
        val usuarios = mutableListOf<Usuários>()
            usuarios.add(usuario)
    }

}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val usuarios = Usuários("mopa,1")
    
    usuarios.matricular(usuarios)
    println(usuarios)
}