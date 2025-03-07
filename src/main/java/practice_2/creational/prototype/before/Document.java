package practice_2.creational.prototype.before;

class Document {
    String text;
    String[] images;

    public Document(String text, String[] images) {
        this.text = text;
        this.images = images;  // Поверхностное копирование ссылки на массив
    }

    public Document clone() {
        return new Document(this.text, this.images); // Проблемы с глубоким копированием
    }
}
