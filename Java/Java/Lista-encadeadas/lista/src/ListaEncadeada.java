public class ListaEncadeada<T> {

    private No inicio;

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
    }
}
