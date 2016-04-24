package Node;

/**
 * Created by captaincode on 24/04/16.
 */
public class ImplNode<Type> extends Node implements Copyable{
    @Override
    public Copyable copy() {
        ImplNode<Type> currentnode = new ImplNode<Type>();
        currentnode.setRightnode(this.next());
        currentnode.setLeftnode(this.prev());
        currentnode.setIndex(this.getIndex());
        currentnode.setValue(this.getValue());
        return currentnode;
    }
}
