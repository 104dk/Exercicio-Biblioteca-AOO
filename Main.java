public class Main 
{
    public static void main(String[] args) 
    {
        
        Autor autor1 = new Autor(" O Autor é : " + " Stephen Hawking " , ", Sua nacionalidade : " + " Reino Unido");
        System.out.println(autor1.nome + autor1.nacionalidade);
        System.out.println("\n");

        Autor autor2 = new Autor(" O Autor é : " + "Stephen Covey " , ", Sua nacionalidade : " +  " Estados Unidos");
        System.out.println(autor2.nome + autor2.nacionalidade);
        System.out.println("\n");

        Aluno aluno = new Aluno(" Maianderson Ferreira da Silva "," 0034 ");
        System.out.println(aluno.nome + aluno.codigo);
        System.out.println("\n");

        Professor professor = new Professor(" Efraim "," 001  ");
        System.out.println(professor.nome + professor.codigo);
        System.out.println("\n");

        Livro livro1 = new Livro(" Uma Breve Historia do tempo ",autor1);
        livro1.emprestadoPor = aluno;
        System.out.println(" Emprestado Por : " + livro1.emprestadoPor.nome);
        System.out.println(livro1.nome + autor1.nome);
        System.out.println("\n");

        Livro livro2 = new Livro(" Os 7 habitos das pessoa altamente eficazes ",autor2);
        livro2.emprestadoPor = professor;
        System.out.println(livro2.nome + autor2.nome);
        System.out.println(" Emprestado Por : "+ livro2.emprestadoPor.nome);
        System.out.println("\n");

    }
}