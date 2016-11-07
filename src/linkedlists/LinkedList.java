package linkedlists;

import interfaces.ListIterable;
import node.SimpleNode;

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

public class LinkedList<Type> implements ListIterable {
    private SimpleNode<Type> headernode, recordnode;
    private int size;

    public LinkedList() {
        this.headernode = null;
        this.recordnode = null;
        this.size = 0;
    }

    @Override
    public boolean add(Object value) {
        //cast the value
        try{
            Type val = (Type) value;
            this.recordnode = new SimpleNode<Type>(this.headernode,val);
            this.recordnode.setIndex(this.size++);
            this.headernode = this.recordnode;
            System.out.println("Adding node #"+this.headernode.getIndex());
        }
        catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public void print(){
        for(SimpleNode hnode = (SimpleNode) this.headernode.copy();
                hnode!=null;
                hnode = (SimpleNode) hnode.next())
            System.out.println("node #"+hnode.getIndex()+", Value ["+hnode.getValue()+"]");
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public boolean remove(int index) {
        try{
            if(index >=0 & index < this.size) {
                boolean founded = false;
                SimpleNode hnode = (SimpleNode) this.headernode.copy();
                for (; hnode != null;
                     hnode = (SimpleNode) hnode.next()) {
                    SimpleNode nextnode = (SimpleNode) hnode.next();

                    if(founded)
                        hnode.setIndex(hnode.getIndex()-1);

                    if (nextnode.getIndex() == index
                            && !founded){
                        hnode.setRightnode(nextnode.next());
                        founded = !founded;
                    }
                }

                if(founded) {
                    this.headernode = (SimpleNode) this.headernode.copy();
                    --this.size;
                }

                return founded;
            }
            else{
                //Throws one created exception
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    //O(1) algorithm
    @Override
    public Object get(int index) {
        try{
            Type[] listarray = (Type[]) this.toArray();
            return listarray[index];
        }
        catch(IndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public Object[] toArray() {
        Type[] internalarray = (Type[]) new Object[this.size];
        SimpleNode hnode = (SimpleNode) this.headernode.copy();

        for(int i=0; i<internalarray.length && hnode != null; i++){
            internalarray[i] = (Type) hnode.getValue();
            hnode = (SimpleNode) hnode.next();
        }

        return internalarray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(4096);
        sb.append("[ ");

        for(SimpleNode hnode = (SimpleNode) this.headernode.copy();
                hnode != null;
                sb.append(hnode.getValue()+" "),
                hnode = (SimpleNode) hnode.next());
        sb.append("]");
        return sb.toString();
    }
}
