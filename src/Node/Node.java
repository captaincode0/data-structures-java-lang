package Node;

/**
 * Created by captaincode on 24/04/16.
 */
public class Node<Type> implements Iterable{
    private Node<Type> leftnode, rightnode;
    private Type value;
    private int index;

    public Node(Node rightnode, Type value){
        this.rightnode = rightnode;
        this.value = value;
    }

    public Node(Node rightnode, Node leftnode, Type value){
        this.rightnode = rightnode;
        this.leftnode = leftnode;
        this.value = value;
    }

    public Node(){
        this.rightnode = null;
        this.leftnode = null;
    }

    public void setRightnode(Node rightnode){
        this.rightnode = rightnode;
    }

    public void setLeftnode(Node leftnode){
        this.leftnode = leftnode;
    }

    public Type getValue(){
        return this.value;
    }

    public void setValue(Type value){
        this.value = value;
    }

    public int getIndex(){
        return this.index;
    }

    public void setIndex(int index){
        this.index = index;
    }

    @Override
    public Node prev() {
        return this.leftnode;
    }

    @Override
    public Node next() {
        return this.rightnode;
    }
}
