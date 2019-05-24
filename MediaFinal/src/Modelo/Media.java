
package Modelo;

public class Media extends absPropriedades
{

    public Media(Double notanp1, Double notanp2, Double notaExame)
    {
        super(notanp1, notanp2, notaExame);
    }
    @Override
    public void Executar()
    {
        this.mensagem = "";
        if(this.notaExame.equals(0.0))
        {
         Double media = this.notanp1+this.notanp2;
         media/=2;
         if (media>=7)
         {
             this.resposta = String.valueOf(media)+" aprovado ";
         }
         else 
             this.resposta = String.valueOf(media)+" exame ";
        }
        
        if(this.notaExame>0)
        {
         Double media = this.notanp1+this.notanp2;
         media/=2;
         media+=notaExame;
         media/=2;
         if (media>=5)
         {
             this.resposta = String.valueOf(media)+" aprovado ";
         }
         else 
             this.resposta = String.valueOf(media)+" reprovado ";
        }
    }
    
}
