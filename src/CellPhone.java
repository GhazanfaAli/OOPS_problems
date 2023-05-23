// Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

public class CellPhone {
    void ringing(){
        System.out.println("phone is Ringing.........");
    }
    void vibrating(){
        System.out.println("phone is Vibrating.........");
    }
    void talking(){
        System.out.println("Please attend your call.........");
    }

    public static void main(String args[]){
        CellPhone obj1 = new CellPhone();
        obj1.ringing();
        obj1.talking();
        obj1.vibrating();

    }
}
