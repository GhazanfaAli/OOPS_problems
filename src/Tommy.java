 class Tommy {
    public void hit(){
        System.out.println(".....Hitting........ enemy");
    }
    public void run(){
        System.out.println("......Running from..........  enemy");
    }
    public void fire(){
        System.out.println("......Firing ........");
    }
    public static void main(String args[]){
        Tommy a = new Tommy();
        a.fire();
        a.hit();
        a.run();
    }
}
