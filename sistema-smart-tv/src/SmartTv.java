public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume=25;
    public void mudarCanal (int novoCanal){

        canal = novoCanal;
    }

    public void aumentarCanal(){

        canal ++ ;
        //System.out.println("Voce aumentou o canal para : " + canal);
    }

    public void diminuirCanal(){
        canal--;
        //System.out.println("Voce Diminuiu o canal para : " + canal);

    }
    
    
    public void aumentarVolume(){
        //volume = volume + 1; 
        volume++;
        System.out.println("O Volume aumentou para :  "  + volume);
    }
    public void diminuirVolume(){

        volume --;
        System.out.println("O Volume Diminuiu para : " + volume);
    }

    
    public void ligar (){

        ligada = true;
    }

    public void desligar (){

        ligada = false;

    }


}
