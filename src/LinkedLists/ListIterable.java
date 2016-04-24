package LinkedLists;

import java.lang.reflect.Array;

/**
 * Created by captaincode on 24/04/16.
 */
public interface ListIterable {
    public boolean add(Object value);
    public boolean remove(int index);
    public Object get(int index);
    public Object[] toArray();
}
