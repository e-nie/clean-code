package practice_2.behavioral.iterator.after_mine;

public class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("1984"));
        collection.addBook(new Book("Brave New World"));

        // Обойдем коллекцию книг с помощью реализованного итератора
        Iterator<Book> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
