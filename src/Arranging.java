import java.util.Scanner;

public class Arranging {
    public static int ArrageCoin(int Number)
    {
        int i=1,count=0;
        while(Number>i)
        {
            Number-=i;
            count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number= scanner.nextInt();
        System.out.println(ArrageCoin(Number));
    }
}
