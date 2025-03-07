package practice_2.structural.proxy.after;

public class Main {
    public static void main(String[] args) {
        // при создании imageProxy не происходит загрузка изображения
        ImageProxy imageProxy = new ImageProxy("path/to/high/res/image");

        // загрузка изображения происходит в момент вызова showImage
        imageProxy.showImage();

        // какой-то код
        // какой-то код
        // какой-то код

        // загрузка не повторяется
        imageProxy.showImage();
    }
}
