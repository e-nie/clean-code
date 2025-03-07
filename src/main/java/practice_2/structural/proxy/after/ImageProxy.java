package practice_2.structural.proxy.after;

public class ImageProxy implements  Showable {
    private String imageFilePath;
    private HighResolutionImage image;

    // в конструкторе мы НЕ загружаем изображение
    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    // ЛЕНИВАЯ ЗАГРУЗКА
    // загрузка изображения происходит во время запроса на отображение изображения
    @Override
    public void showImage() {
        if (this.image == null) {
            // здесь происходит загрузка изображения
            this.image = new HighResolutionImage(this.imageFilePath);
        }
        this.image.showImage();
    }
}
