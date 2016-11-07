package linkedlists;

import interfaces.ListIterable;
import node.DoubleNode;

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

public class DoubleLinkedList<Type> implements ListIterable {
    private DoubleNode headernode, recordnode;
    private int size;

    public DoubleLinkedList(){
        this.headernode = null;
        this.recordnode = null;
    }

    @Override
    public String toString() {
        try {
            StringBuilder sb = new StringBuilder(4096);
            DoubleNode hnode = (DoubleNode) this.headernode.copy();
            sb.append("[");

            for(;hnode != null;
                sb.append(hnode.getValue()+" "),
                hnode = (DoubleNode) hnode.prev());
            sb.append("]");

            return sb.toString();
        }
        catch(NullPointerException ex){
            ex.printStackTrace();
            return "";
        }
    }

    @Override
    public boolean add(Object value) {
        try{
            //if the record node was created
            this.recordnode = new DoubleNode(this.headernode, this.headernode.prev(), (Type)value);
            this.recordnode.setLeftnode(this.headernode);
            this.recordnode.setIndex(this.size++);
            this.headernode = this.recordnode;
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(int index) {
        try{
            if(index>=0 & index<this.size){
                boolean founded = false;
                for(DoubleNode hnode = (DoubleNode)this.headernode.copy();
                    hnode != null;
                    hnode = (DoubleNode) hnode.next()){

                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
