package variablesGenericas;

public class genericos<T> {

    private T t;

    public genericos() {

    }

    public genericos(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
