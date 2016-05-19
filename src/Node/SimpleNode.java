package Node;

/**
 * Created by captaincode on 24/04/16.
 */
public class SimpleNode<Type> extends Node implements Copyable{
    public SimpleNode(SimpleNode rightnode, Type value){
        super(rightnode, value);
    }

    public SimpleNode(){
        super();
    }

    @Override
    public Copyable copy() {
        SimpleNode<Type> cnode = new SimpleNode<Type>();
        cnode.setRightnode(this.next());
        cnode.setValue(this.getValue());
        cnode.setIndex(this.getIndex());
        return cnode;
    }
}
