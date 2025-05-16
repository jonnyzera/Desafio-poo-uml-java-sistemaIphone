package br.com.joaovictor.iphone.interfaces;

public interface aparelhoTelefonico {
    // Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
    default void ligar(String numero){};
    default void atender(){};
    default void iniciarCorreioVoz(){};
}
