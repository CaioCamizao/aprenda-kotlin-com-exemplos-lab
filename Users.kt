enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuarios(val nome: String)

data class ConteudosEducacionais(val materia: String, val nivel: Nivel ,val duracao: Int = 0)

data class Formacao(val nome: String, var conteudos: List<ConteudosEducacionais>) {

    val inscritos = mutableListOf<Usuarios>()

    fun matricular(usuario: Usuarios) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}