
public class Primefactor {
    public static void main(String[] args) {
        int n=256;
        for(int i=1;i<256;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
