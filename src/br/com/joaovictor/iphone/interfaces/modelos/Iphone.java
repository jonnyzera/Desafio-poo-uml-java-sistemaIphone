package br.com.joaovictor.iphone.interfaces.modelos;
import br.com.joaovictor.iphone.interfaces.aparelhoTelefonico;

import br.com.joaovictor.iphone.interfaces.aparelhoTelefonico;
import br.com.joaovictor.iphone.interfaces.navegadorInternet;
import br.com.joaovictor.iphone.interfaces.reprodutorMusical;

public class Iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical{

    // Teste Aparelho Telefonifco
    @Override
    public void ligar(String numero) {
        System.out.println("Começar a tocar músicar: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Começar a atender!");
    }

    @Override
    public void iniciarCorreioVoz() {
       System.out.println("Inicializando um correio de voz!");
    }

    // Teste Navegador de Internet 
    @Override
    public void exibirPagina(String url) {
       System.out.println("Exibindo uma página url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba!");
    }

    @Override
    public void atualizarPagina() {
       
    }

    // Teste Reprodutor Musical
    @Override
    public void tocar() {
         System.out.println("Tocando uma música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma música!");
    }

    @Override
    public void selecionarMusicar(String musica) {
        System.out.println("Selecione uma música: " + musica);
    }
}