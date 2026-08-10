package practice_2.structural.facade.after_mine;

public class Main {
    public static void main(String[] args) {

        // алгоритм обработки видео
        VideoFile videoFile = new VideoFile("example.mp4");
        CodecConverter codecConverter = new CodecConverter();
        AudioMixer audioMixer = new AudioMixer();


        MultimediaFacade multimediaFacade = new MultimediaFacade(videoFile, codecConverter, audioMixer);
        multimediaFacade.prepareData();




    }
}
