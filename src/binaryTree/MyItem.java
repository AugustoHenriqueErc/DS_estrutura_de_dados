package binaryTree;

public class MyItem implements Item{
    private int key;
    // outros componentes do registro

    public MyItem (int chave) { this.key = chave; }

    public int equals (Item it) {
        MyItem item = (MyItem) it;
        if (this.key < item.key) return -1;
        else if (this.key  > item.key) return 1;
        return 0;
    }
    public void changeKey (Object chave) {
        Integer ch = (Integer) chave;
        this.key = ch.intValue ();
    }

    public Object getKey () {
        return new Integer(this.key);
    }
}
