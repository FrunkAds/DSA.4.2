import java.util.Arrays;

public class HashMap {
    private final static int TABLE_SIZE = 12;
    private HashEntry[] table;

    public HashMap() {
        table = new HashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
    }

    public String get(int key) {
        int hash = (key % TABLE_SIZE);
        int count = 0;
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % TABLE_SIZE;
            if (count == TABLE_SIZE) {
                throw new HashTableException("No matching key in the table");
            }
            count++;
        }

        if (table[hash] == null) {
            throw new HashTableException("No matching key in the table");
        }

        return table[hash].getValue();
    }

    public void put(int key, String value) throws HashTableException {
        int hash = (key % TABLE_SIZE);
        int count = 0;
        while (table[hash] != null && table[hash].getKey() != key) {
            if(table[hash].getKey()==-1){
                table[hash] = new HashEntry(key, value);
                return;
            }
            hash = (hash + 1) % TABLE_SIZE;
            if (count == TABLE_SIZE) {
                throw new HashTableException("Table full");
            }
            count++;
        }

        table[hash] = new HashEntry(key, value);
    }

    public void remove(int key){
        int hash = (key%TABLE_SIZE);
        while (table[hash]!=null && table[hash].getKey()!=key){
            hash = (hash+1)%TABLE_SIZE;
        }
        if(table[hash]!= null){
            table[hash]=DeletedEntry.getUniqueDeletedEntry();
        }
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
