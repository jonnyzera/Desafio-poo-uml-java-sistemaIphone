package br.com.joaovictor.iphone.interfaces;

public interface navegadorInternet{
    // Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()
      default void exibirPagina(String url){}
      default void adicionarNovaAba(){}
      default void atualizarPagina(){}
}
