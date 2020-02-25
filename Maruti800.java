class Car
{
 public Car()
{
System.out.println("Class Car");
}
public void VehicleType()
{
System.out.println("Vehicle type:car");
}
}
class Maruti extends Car
{
public Maruti()
{
System.out.println("Class Maruti");
}
public void brand()
{
System.out.println("Brand:Maruti");
}
public void speed()
{
System.out.println("Max: 90kmph");
}
}
public class Maruti800 extends Maruti
{
public Maruti800()
{
System.out.println("Maruti Model:800");
}
public void speed()
{
Sytsem.out.print("Max: 80kmph");
}
public static void main(String args[])
{
Maruti800 obj=new Maruti800();
obj.vehicleType();
obj.brand();  
 }
}