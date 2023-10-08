package aplicativos.telefone;


import java.util.Random;

public class Telefone implements AparelhoTelefone {
    public void ligar(String number) {
        int tentativasRealizadas= 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        System.out.println("ligando para: +55" + number);

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            } 

            if(atendeu){
                System.out.println("Falando com: " +  number);
            } else if (tentativasRealizadas < 4) {
                System.out.println("Ligando...");
            } else {
                System.out.println("A pessoa do número " + number + ", não atendeu a sua ligação.");
                iniciarCorreioVoz();

            }

        } while(continuarTentando && tentativasRealizadas < 4);
        
    }

    protected boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    protected void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
