
public class Program13 {
  public static void main(String[] args) {
    int n=264,reverse=0;
    while(n!=0)
    {
      reverse=(reverse*10)+n%10;
      n/=10;
    }
    System.out.println(reverse);
    
  }  
}
