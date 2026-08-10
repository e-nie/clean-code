package practice_2.structural.facade.after_mine;

class VideoFile {
    String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
    }

    public void load() {
        System.out.println("Loading video file: " + fileName);
    }
}