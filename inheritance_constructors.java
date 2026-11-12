class base1 {
    public base1()
    {System.out.println(" i am Base class constructor");}
public base1(int x)
    {System.out.println(" i am Base class constructor with value: " + x);}}
    class derived1 extends base1{
    public derived1( int x, int y)
    {
    super(x);
        System.out.println(" i am Derived class constructor with value: " + y);
    }}
public  class inheritance_constructors {
    public static void main(String args[]){
    derived1 d = new derived1(5,7);}
}
