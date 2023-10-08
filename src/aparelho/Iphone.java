package aparelho;

import aplicativos.navegador.NavegadorInternet;
import aplicativos.navegador.WebBrowser;
import aplicativos.reprodutor.ReprodutorMusica;
import aplicativos.reprodutor.Reprodutor;
import aplicativos.telefone.AparelhoTelefone;
import aplicativos.telefone.Telefone;

public class Iphone {
    public static void main(String[] args) {
        System.out.println("Iphone");

        AparelhoTelefone telefone = new Telefone();
        ReprodutorMusica reprodutor = new Reprodutor();
        NavegadorInternet navegador = new WebBrowser();
        telefone.ligar("11998203747");
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica("Bichota, Karol G");
        navegador.exibirPagina("web.dio.me");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
