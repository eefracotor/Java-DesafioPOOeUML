package aplicativos.navegador;

public class WebBrowser implements NavegadorInternet {
    public void exibirPagina(String pagina) {
        System.out.println("A carregar...\nhttps://" + pagina);
    }

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
