public class Program10 {
    public static void main(String[] args) {
        int a=5,b=10,c=3;
        if(a<b && b<c)
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        if(b<a && a<c)
        {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else{
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
    }
    
}
