package Node;

/**
 * Created by captaincode on 24/04/16.
 */
public class SimpleNode<Type> extends Node implements Copyable{
    public SimpleNode(SimpleNode rightnode, Type value){
        this.setRightnode(rightnode);
        this.setValue(value);
    }

    public SimpleNode(){}

    @Override
    public Copyable copy() {
        SimpleNode<Type> cnode = new SimpleNode<Type>();
        cnode.setRightnode(this.next());
        cnode.setValue(this.getValue());
        cnode.setIndex(this.getIndex());
        return cnode;
    }
}
