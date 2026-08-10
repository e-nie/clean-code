package practice_2.structural.proxy.after_mine;

public class Main {
    public static void main(String[] args) {
        // в момент создания прокси изображение не загружается
        ImageProxy imageProxy = new ImageProxy("path/to/high/res/image");
/*
        проходит много времени
         */
        // отображения изображение
        imageProxy.show();

        /*
        много времени прошло
         */

        //изображение не загрузится повторно
        imageProxy.show();
    }
}
