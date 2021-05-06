# Exercicio-Biblioteca-AOO

trabalho de OAT

EXERCÍCIOS


Para criar o sistema de empréstimo de livros de uma biblioteca será necessário construir as seguintes classes em Java: Pessoa, Autor, Aluno, Professor, Livro.

 A classe Pessoa deve ser uma classe abstrata, a qual possui um atributo “nome” do tipo String. Também possui um método construtor que recebe o nome da pessoa e deve estar implementado para receber o valor por parâmetro e colocar o valor no atributo “nome”. Também é necessário ter nessa classe os respectivos métodos setters e getters implementados para o atributo “nome”.
As classes Autor, Professor e Aluno devem herdar da classe Pessoa. 
A classe Autor deve agregar o atributo “nacionalidade” e seus respectivos métodos setter e getter. Também deve sobrecarregar o método construtor para receber o nome da pessoa e a nacionalidade.
A classe Professor e a classe Aluno ambas devem sobrecarregar o método construtor para receber o nome e o código. Isso precisa que você crie o atributo "código" em ambas classes. Esse tributo deve ter seus respectivos métodos getter e setter.
A classe Livro deve ter os seguintes atributos: “nome”, que será do tipo String; o atributo “autor” que deve ser do tipo Autor; e o atributo “emprestadoPor” que deve ser do tipo Pessoa. O método construtor deve receber o nome e autor do livro. Cada atributo deve ter seus respectivos métodos setter e getter.
Adicionalmente, crie uma classe Main.java que contenha o método main(). 
Dentro do método main:
Crie um primeiro objeto chamado “autor1” do tipo Autor e como nome passe o valor “Stephen Hawking” e como nacionalidade passe o valor “Reino Unido”.
Crie um segundo objeto do tipo Autor chamado “autor2” e como nome passe o valor “Stephen Covey” e como nacionalidade passe o valor “Estados Unidos”.
Crie um objeto do tipo Aluno, passe qualquer valor como nome e código.
Crie um objeto do tipo Professor, passe qualquer valor como nome e código.
Crie um primeiro objeto do tipo Livro chamado livro1 e como nome passe o valor “Uma breve história do tempo” e como autor passe o objeto “autor1” criado previemente. Em seguida, use o respectivo método setter do atributo “emprestadoPor” para colocar nele como valor o objeto do tipo Aluno criado previamente.
Crie um segundo objeto do tipo Livro chamado livro2 e como nome passe o valor “Os 7 hábitos das pessoa altamente eficazes” e como autor passe o objeto “autor2” criado previemnte. Em seguida, use o respectivo método setter do atributo “emprestadoPor” para colocar nele como valor o objeto do tipo Professor criado previamente.
Use System.ou.println() para imprimir algunas das informações de cada livro como o nome, nome e nacionalidade do autor, e nome da pessoa que emprestou o livro.

NOTA: Devem ser entregues os arquivos .java de cada classe em um repositório no Github chamado “Exercicio-Biblioteca-AOO”. Na atividade só deve ser anexado o link do repositório.
