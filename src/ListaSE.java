public class ListaSE{
    private Celula primeiro;
    public ListaSE(){
        primeiro = null;
    }
    public boolean vazia(){
        return primeiro == null;
    }
    public void inserirNoInicio(int valorNovo){
        this.inserirNoInicio(new Celula(valorNovo));
    }
    private void inserirNoInicio(Celula nova){
        nova.prox = primeiro;
        primeiro = nova;
    }
    public void imprimir(){
        Celula aux = primeiro;
        while(aux != null){
            System.out.println(aux.valor);
            aux = aux.prox;
        }
    }
    private void inserirNoFinal(Celula novo)
    {

    }
    public Celula pesquisar()
    {
        return new Celula<>(1);
    }
}