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

    public SimpleNode copyCurrentNode(){
        return (SimpleNode) this.copy();
    }
}
