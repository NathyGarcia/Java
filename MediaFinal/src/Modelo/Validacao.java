package Modelo;

public class Validacao extends absPropriedades 
{

    public Validacao(String np1, String np2, String exame)
    {
        super(np1, np2, exame);
    }
     
    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.notanp1=Double.parseDouble(this.np1);
            this.notanp2=Double.parseDouble(this.np2);
            this.notaExame=Double.parseDouble(this.exame);
        }
        catch (Exception e)
        {
            this.mensagem = "erro";
        }
    }
}
