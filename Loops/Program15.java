public class Program15 {
    public static void main(String[] args) {
        int firstnum=0,secondnum=1;
        for(int i=0;i<8;i++)
        {
            System.out.print(firstnum +",");
            int nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;
            
        }
    }
}
