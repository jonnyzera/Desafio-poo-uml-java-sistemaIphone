package br.com.joaovictor.iphone.interfaces.app;
import br.com.joaovictor.iphone.interfaces.modelos.Iphone;

public class Main {
    public static void main(String[] args){
        Iphone iphone = new Iphone();

        // Aparelho Telefonifco ligar(String numero), atender(), iniciarCorreioVoz()
        System.out.println("=========================================================================");
        iphone.ligar("2407-2043");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador da Internet: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()
        System.out.println("=========================================================================");
        iphone.exibirPagina("https://web.dio.me/lab/desafio-de-projeto-1/learning/e3b2650f-ece9-43ee-b020-1074306e1f07?back=/track/santander-2024-backend-com-java");
        iphone.adicionarNovaAba();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Reprodutor Musical:  tocar(), pausar(), selecionarMusica(String musica)
        System.out.println("=========================================================================");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusicar("Boate Azul: Bruno & Marrone");
        

    }

}
