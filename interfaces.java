interface intf { 
    //all methods must be abstract
    abstract public void thi(); 
    //use implements keyword to inherit instead of extends
}

class inti implements intf{
    public void thi (){
        System.out.println("Implemented !");
    }
}

public class interfaces {
    public static void main(String[] args) {
        inti f = new inti();
        f.thi();
    }

    
}
