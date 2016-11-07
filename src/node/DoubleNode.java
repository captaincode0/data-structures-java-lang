package node;

import interfaces.Copyable;

/**
 *	   _____            _        _                     _
 *	  / ____|          | |      (_)                   | |
 *	 | |     __ _ _ __ | |_ __ _ _ _ __   ___ ___   __| | ___
 *	 | |    / _` | '_ \| __/ _` | | '_ \ / __/ _ \ / _` |/ _ \
 *	 | |___| (_| | |_) | || (_| | | | | | (_| (_) | (_| |  __/
 *	  \_____\__,_| .__/ \__\__,_|_|_| |_|\___\___/ \__,_|\___|
 *	             | |
 *	             |_|
 */
public class DoubleNode<Type> extends Node implements Copyable{
    public DoubleNode(DoubleNode rightnode, DoubleNode leftnode, Type value){
        super(rightnode, leftnode, value);
    }

    public DoubleNode(){
        super();
    }

    @Override
    public Copyable copy() {
        DoubleNode<Type> currentnode = new DoubleNode<Type>();
        currentnode.setRightnode(this.next());
        currentnode.setLeftnode(this.prev());
        currentnode.setIndex(this.getIndex());
        currentnode.setValue(this.getValue());
        return currentnode;
    }

    public DoubleNode copyCurrentNode(){
        return (DoubleNode) this.copy();
    }
}
