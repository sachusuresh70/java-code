class Vehicle{
    void run(){
    System.out.println("vehicle is running");
}
}
class Car extends Vehicle{
    void run(){
        System.out.println("car is running safely");
    }
}
public class MethodOverridingDemo{
    public static void main (String[]args){
        Vehicle v=new Vehicle();
        v.run();
        Car c=new Car ();
        c.run();
        Vehicle obj=new Car();
        obj.run();

}
}


