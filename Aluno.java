public class Aluno extends Pessoa 
{
    public int matricula;

    public String codigo;
    public Aluno(String nome, String codigo)
    {
        super(nome, codigo);
        this.codigo = codigo;
    }
    public String getcodigo()
	{
		return codigo;
	}

	public void getcodigo(String codigo)
	{
		this.codigo = codigo;
	}

}