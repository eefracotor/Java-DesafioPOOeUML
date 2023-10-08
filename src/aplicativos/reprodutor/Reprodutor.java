package aplicativos.reprodutor;

public class Reprodutor implements ReprodutorMusica {
    public void tocar(){
        System.out.println("Tocando Playlist");
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String name) {
        System.out.println("Tocando musica selecionada: \n-> "+ name +".");
    }
}
