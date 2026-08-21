package br.com.dio;

public class Main {
     static void main() {
        Smartphone musicPlayer = new Smartphone();
        runMusic(musicPlayer);
        runVideo(musicPlayer);

    }
    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}

