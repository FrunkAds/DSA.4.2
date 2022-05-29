public class HashEntry {
    private int key;
    private String value;

    public HashEntry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashEntry{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
