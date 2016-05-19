package LinkedLists;

import Node.ImplNode;

/**
 * Created by captaincode on 24/04/16.
 */
public class DoubleLinkedList<Type> implements ListIterable{
    private ImplNode headernode, recordnode;
    private int size;

    public DoubleLinkedList(){
        this.headernode = null;
        this.recordnode = null;
    }

    @Override
    public String toString() {
        try {
            StringBuilder sb = new StringBuilder(4096);
            ImplNode hnode = (ImplNode) this.headernode.copy();
            sb.append("[");

            for(;hnode != null;
                sb.append(hnode.getValue()+" "),
                hnode = (ImplNode) hnode.prev());
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
            this.recordnode = new ImplNode(this.headernode, this.headernode.prev(), (Type)value);
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
                for(ImplNode hnode = (ImplNode)this.headernode.copy();
                        hnode != null;
                        hnode = (ImplNode) hnode.next()){

                }
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
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
