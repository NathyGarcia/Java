

package Modelo;

public abstract class absPropriedades implements intMetodos
{
    protected String np1;
    protected String np2; 
    protected String exame;
    protected Double notanp1;
    protected Double notanp2;
    protected Double notaExame;
    protected String resposta;
    protected String mensagem;

    public absPropriedades(String np1, String np2, String exame)
    {
        this.np1 = np1;
        this.np2 = np2;
        this.exame = exame;
    }

    public absPropriedades(Double notanp1, Double notanp2, Double notaExame)
    {
        this.notanp1 = notanp1;
        this.notanp2 = notanp2;
        this.notaExame = notaExame;
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }

    public String getMensagem()
    {
        return this.mensagem;
    }

    @Override
    public void Executar()
    {
        
    }
    
    
    
    
    
    
    
    
}
