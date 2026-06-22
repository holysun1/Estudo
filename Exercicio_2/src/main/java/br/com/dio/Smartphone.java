package br.com.dio;

public  class Smartphone implements VideoPlayer, MusicPlayer {
    // interfaces permitem a implementação de várias classes

    @Override
    public void playVideo() {
        System.out.println("Playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stopping video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

}
