package br.com.dio;

public record MusicBox(String music, boolean isPause) implements MusicPlayer {

    @Override
    public void playMusic() {
        
    }

    @Override
    public void pauseMusic() {

    }

    @Override
    public void stopMusic() {

    }
}
