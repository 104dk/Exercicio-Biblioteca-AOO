public abstract class Pessoa {

    public String nome; //nome = atributo, string = tipo da class
    
        public Pessoa (String nome, String nacionalidade) //metodo construtor
        { 
            this.nome = nome;           //receber parametros
        } 

        public String getNome()  
        {  
            return nome;
        }

        public void setNome(String nome) 
        {
            this.nome = nome;
        }

}