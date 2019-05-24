
package Modelo;

public class Controle extends absPropriedades
{

    public Controle(String np1, String np2, String exame)
    {
        super(np1, np2, exame);
    }
    
    @Override
    public void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao (np1,np2,exame);
        validacao.Executar();
        
        if (validacao.getMensagem().equals(""))
        {
           Media media = new Media(validacao.notanp1, validacao.notanp2,validacao.notaExame);
           media.Executar();
           this.resposta = media.toString();
        } 
        else
           this.mensagem = validacao.getMensagem(); 
     
         
     
    }
    
}
