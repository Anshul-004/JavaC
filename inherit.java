class a{
    public int show(int a) //if its done private, it won't be accessible in main, and neither would be inherited.
    {
        return a;
    }
}

class b extends a{
    private
        int x = 10;
    public int disp()
    {
        return x;
    }
}

public class inherit {
    public static void main(String[] args) {
        b obj = new b();
        obj.show(5);
    }
}
