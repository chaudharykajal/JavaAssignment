import org.w3c.dom.ls.LSException;

public class Program16{
    public static void main(String[] args) {
        int sum=0,n=371;
        int temp=n;
        
        while(temp!=0)
        {
            int lastdigit=temp%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            temp=temp/10;
        }
        
        if(sum==n)
        {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}