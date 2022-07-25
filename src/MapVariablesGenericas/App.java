package MapVariablesGenericas;

public class App<K, V> {
    private K K;
    private V V;

    public App() {

    }

    public App(K k, V v) {
        this.K = k;
        this.V = v;
    }

    public K getK() {
        return K;
    }

    public void setK(K k) {
        this.K = k;
    }

    public V getV() {
        return V;
    }

    public void setV(V v) {
        this.V = v;
    }

}
