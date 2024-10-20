import java.util.List;

public class ChainedHashTable<T extends Comparable<? super T>> implements HashTable<T>{

    private int currSize = 0;
    private List<T>[] table;
    
    @Override
    public void insert(T e) {
    }

    @Override
    public void remove(T e) {
        int idx = this.hash(e);
        List<T> list = this.table[idx];
        if(list.contains(e)) {
            list.remove(e);
            --currSize;
        }
    }

    @Override
    public boolean contains(T e) {
        int idx = this.hash(e);
        List<T> list = this.table[idx];
        return list.contains(e);
    }

    @Override
    public void empty() {
        this.currSize = 0;
        for (List<T> list : this.table) {
            list.clear();
        }
    }

    @Override
    public void rehash() {
    }

    @Override
    public int hash(T e) {
        int hashedVal = e.hashCode();
        hashedVal %= this.table.length;
        return (hashedVal < 0) ? hashedVal += this.table.length : hashedVal;
    }
    
}
