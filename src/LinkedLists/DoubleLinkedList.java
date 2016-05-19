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
        }
    }

    @Override
    public boolean add(Object value) {
        try{
            this.recordnode = new ImplNode(null, this.headernode, (Type) value);
            this.recordnode.setIndex();
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
            return false
        }
    }

    @Override
    public boolean remove(int index) {
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
