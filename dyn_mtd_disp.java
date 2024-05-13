class phone{
    public void disp()
    {
        System.out.println("It's in Phone class");
    }
    public void ph()
    {
        System.out.println("mtd of phone class");
    }
}

class smartphone extends phone{
    public void smdisp()
    {
        System.out.println("It's in SmartPhone Class");
    }
    public void disp()
    {
        System.out.println("Disp of smartphone class");
    }
}

public class dyn_mtd_disp {
    public static void main(String[] args) {
    //     phone obj1 = new phone();
    //     smartphone obj = new smartphone();
        
    //     obj.disp();
    //     obj.smdisp();
    //     obj1.disp();
    
    //parent class ka object can be initiated as object of child class
    phone obj = new smartphone();
    // obj.disp();

    //but when ref /object is of subclass and const is of parent class, its not true
    // smartphone ob = new phone(); (error)

    //but it can access methods only of phone class, and those overidden in smartphone
    obj.disp();
    // obj.smdisp(); --> can't access functions of smartphone class
    obj.ph();
    }
}
