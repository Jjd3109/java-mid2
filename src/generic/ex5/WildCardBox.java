package generic.ex5;

import generic.animal.Animal;

public class WildCardBox<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
