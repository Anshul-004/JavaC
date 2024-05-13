abstract class parent{
    abstract public void disp();
}

//now any class, to have extended parent MUST have disp overridden

class child extends parent
{
    @Override
    public void disp()
    {
        System.out.println("In child class");
    }
}

public class abst {
    public static void main(String[] args) {
        //abstract -> declared not defined.

        child c = new child();
        c.disp();

        // parent p = new parent(); --> abstract classes can't have objects

    }
}
