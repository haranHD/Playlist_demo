class Private{
    //private String a = "8778739197";
    int a = 140;  // default`
    void phone(){
        System.out.println("Private Number : "+a);
    }
}

class Another extends Private{
    void phone1(){
        System.out.println("Private Number : "+a);
        //String a1 = "9942694347";
        //System.out.println("Another Number : "+a1);
    }
}



class Parent {
    private int privateVar = 10;        // Not accessible in child
    int defaultVar = 20;               // Accessible only in the same package
    protected int protectedVar = 30;   // Accessible in the same package or subclass
    public int publicVar = 40;         // Accessible everywhere

    public void showVars() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

class Child extends Parent {
    void display() {
        // System.out.println("Private: " + privateVar); // ERROR: privateVar is not accessible
        System.out.println("Default: " + defaultVar);   // Accessible if in the same package
        System.out.println("Protected: " + protectedVar); // Accessible in subclass
        System.out.println("Public: " + publicVar);     // Always accessible
    }
}

class Am{
    public static void main(String[] a){
        Another ot = new Another();
        ot.phone();
        ot.phone1();
        Child child = new Child();
        child.display();
    }
}

