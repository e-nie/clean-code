package practice_2.creational.prototype.after;

class Document implements Copyable {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images.clone();  // Поверхностное копирование ссылки на массив
    }

    @Override
    public Document copy() {
        // глубокое копирование
        String[] imagesCopy = new String[images.length];
        System.arraycopy(this.images, 0, imagesCopy, 0, images.length);

        return new Document(text, imagesCopy);
    }
}
