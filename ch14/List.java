package ch14;

public interface List {
    Node add(String data);
    void printAll();
    Node remove(int position);
    Node insert(int position, String data);
    Node getElement(int position);
    void removeAll();
    int getSize();
    boolean isEmpty();
}