public class Livro 
{
    String nome;
    public Autor autor;
    public Pessoa emprestadoPor;

    public Livro(String nome, Autor autor)
    {
      this.nome = nome;
      this.autor = autor;

    }
    public Autor getautor()  
      {  
        return autor;
      }

    public void setautor(Autor autor) 
    {
      this.autor = autor;
    }

    public Pessoa getemprestadopor()  
    {  
      return this.emprestadoPor;
    }

    public void setemprestadopor(Pessoa emprestadopor) 
    {
      this.emprestadoPor = emprestadopor;
    }
    
}
//Autor Autor2 = new Autor();



 //       Autor1.emprestadoPor = new Pessoa("Stephen Hawking");
   //     Autor2.emprestadoPor = new Pessoa("Usuario");

     //   System.out.println(livro.emprestadoPor.getNome());// nome//emprestado e um objeto