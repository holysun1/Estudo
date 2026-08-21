package br.com.dio;

public interface VideoPlayer extends MusicPlayer {
    //Não há necessidade de declaração de métodos pois se trata de interfaces

    void playVideo();

    void pauseVideo();

    void stopVideo();


}
