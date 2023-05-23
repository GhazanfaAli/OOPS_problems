/*

==> Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)

 */
class Employee{
     int salary;
     String name;

    int getSalary(){
    return salary;
}
    String getName(){
        return name;
    }
        void setName(String name){
        this.name = name;
        }
}
public class Emp {
    public static void main(String[] args) {
        Employee ob1 = new Employee();
        ob1.setName("arif");
        ob1.salary = 2000;
        System.out.println(ob1.getName());
        System.out.println(ob1.getSalary());
        }
    }
