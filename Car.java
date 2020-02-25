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
class Maruthi extends car
{
public maruti()
{
System.out.println("Class Maruthi");
}
public void brand()
{
System.out.println("Brand:Maruthi");
}
public void speed()
{
System.out.println("Max: 90kmph");
}
}
public class Maruthi800 extends Maruthi
{
public Maruthi800()
{
System.out.println("Maruthi Model:800");
}
public void speed()
{
Sytsem.out.print("Max: 80kmph");
}
public static void main(String args[])
{
Maruthi800 obj=new Maruthi800();
obj.vehicleType();
obj.brand();  
 }