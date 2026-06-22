package br.com.dio;

public interface  MusicPlayer {

    // public String music = "Parabens para você";
    // Em uma interface as variaveis public são final e static
    // ou seja uma vez definida não poderá ser alterada; então public 'final' seria redundante

    void playMusic();

    void pauseMusic();

    void stopMusic();

}
