package interfaces;

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

/**
 * This interface was created for copy one object, associated into a type,
 * just need the implementation to copy one object, and create a new reference.
 *
 * Examples
 *
 * class MyClass implements interfaces.Copyable{
 *     private int x;
 *     private int y;
 *
 *     public MyClass(){
 *
 *     }
 *
 *     public MyClass(int x, int y){
 *         this.x = x;
 *         this.y = y;
 *     }
 *
 *     public void setX(int x){
 *          this.x = x;
 *     }
 *
 *     public int getX(){
 *         return this.x;
 *     }
 *
 *     public void setY(int y){
 *         this.y = y;
 *     }
 *
 *     public int getY(){
 *          return this.y;
 *     }
 *
 *     @Override
 *     public Copyable copy(){
 *          //initialize with the empty constructor
 *          MyClass tmpobject = new MyClass();
 *
 *          //set all values of new object with the current object
 *          tmpobject.setX(tmpobject.getX());
 *          tmpobject.setY(tmpobject.getY());
 *
 *          return tmpobject;
 *     }
 * }
 */

public interface Copyable {
    public Copyable copy();
}
