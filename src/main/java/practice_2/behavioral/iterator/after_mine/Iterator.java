package practice_2.behavioral.iterator.after_mine;

public interface Iterator<T> {
    boolean hasNext();//метод возвращает true, если есть следующий элемент в коллекции
    T next(); // метод возвращает следующий элемент коллекции
}
