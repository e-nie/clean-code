package practice_2.behavioral.iterator.after_mine;

public interface IterableCollection<T> {
    Iterator<T> createIterator();// метод по созданию итератора(фабричный метод)
}
