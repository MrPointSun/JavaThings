package org.example;

public class KeyValuePair<K, V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public KeyValuePair() {
        System.out.println("this is KeyValuePair");
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String[] args) {
        KeyValuePair<String, Integer> pair1 = new KeyValuePair<>("age", 25);
        KeyValuePair<String, String> pair2 = new KeyValuePair<>("name", "John");
        KeyValuePair<String, String> pair3 = new KeyValuePair<>();

        System.out.println(pair1.getKey() + ": " + pair1.getValue());
        System.out.println(pair2.getKey() + ": " + pair2.getValue());
    }
}

