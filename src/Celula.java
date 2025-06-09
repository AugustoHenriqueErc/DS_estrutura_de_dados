public class Celula<T>{
    T valor;
    Celula prox;
    public Celula(T valor){
        this.valor = valor;
        this.prox = null;
    }
}
