// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

fun main() {
    //Criando os Usuarios através da sequencia de cima para baixo na lógica de programação!
    val usuario1 = Usuarios("Caio")
    val usuario2 = Usuarios("Rodrigo")

    //Criando os materiais de estudo como segundo passo e adicionando o Nivel conforme sugerido no video!
    val moduloGit = ConteudosEducacionais("Instalando o Git", Nivel.BASICO, 30)
    val moduloGitHub = ConteudosEducacionais("Subindo Repositório", Nivel.INTERMEDIARIO,45)

    //Criando a lista de conteudos inferidos para acesso na DATA CLASS formação!
    val conteudos = mutableListOf(moduloGit, moduloGitHub)

    //Criando uma variavel chamada formações para acessar a DATA CLASS formação e adicionar conteudo aos Usuarios criados!
    val formacoes = Formacao("DevMobileAndroid", conteudos)

    //Criado o armazenamento da variavel formacoes, fiz a chamada da mesma para poder matricular através da fun matricular os usuarios 1 e 2!
    formacoes.matricular(usuario1)
    formacoes.matricular(usuario2)

    //Saída de dados!
    println("Os alunos ${usuario1.nome} e ${usuario2.nome} foram matriculados para cursar o ${formacoes.nome} com as seguintes matérias:" +
            "\n Matéria: ${moduloGit.materia} -- Nivel: ${moduloGit.nivel} -- Duração: ${moduloGit.duracao} min/H" +
            "\n Matéria: ${moduloGitHub.materia} -- Nivel: ${moduloGitHub.nivel} -- Duração: ${moduloGitHub.duracao} min/H")
}
