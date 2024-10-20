public interface HashTable<T extends Comparable<? super T>> {
    int DEFAULT_TABLE_SIZE = 13;
    public void insert(T e);
    public void remove(T e);
    public boolean contains(T e);
    public void empty();
    public void rehash();
    public int hash(T e);
}
