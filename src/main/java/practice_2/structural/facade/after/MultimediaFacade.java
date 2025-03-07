package practice_2.structural.facade.after;

public class MultimediaFacade {
    private AudioMixer audioMixer;
    private CodecConverter codecConverter;
    private VideoFile videoFile;

    public MultimediaFacade(AudioMixer audioMixer, CodecConverter codecConverter, VideoFile videoFile) {
        this.audioMixer = audioMixer;
        this.codecConverter = codecConverter;
        this.videoFile = videoFile;
    }

    // этот метод является точкой доступа или фасадом к сложной логике обработки данных
    public void prepareMedia() {
        videoFile.load();
        codecConverter.convert(videoFile.fileName);
        audioMixer.fixAudio();
    }
}
