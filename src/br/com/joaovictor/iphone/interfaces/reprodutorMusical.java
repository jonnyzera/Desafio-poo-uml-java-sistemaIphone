package br.com.joaovictor.iphone.interfaces;

public interface reprodutorMusical {
    // Métodos: tocar(), pausar(), selecionarMusica(String musica)
      default void tocar(){}
      default void pausar(){}
      default void selecionarMusicar(String musica){}
}