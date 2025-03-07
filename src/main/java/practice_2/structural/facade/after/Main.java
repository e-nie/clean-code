package practice_2.structural.facade.after;

public class Main {
    public static void main(String[] args) {
        VideoFile videoFile = new VideoFile("example.mp4");
        CodecConverter codecConverter = new CodecConverter();
        AudioMixer audioMixer = new AudioMixer();

        MultimediaFacade multimediaFacade = new MultimediaFacade(audioMixer, codecConverter, videoFile);
        multimediaFacade.prepareMedia();

        multimediaFacade.prepareMedia();
    }
}
