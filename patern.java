import java.util.Scanner;

public class patern {
	public static void main(String s[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i=0, j, X;
        char k;
        System.out.println("Enter n :");
        n = sc.nextInt();
        for(X=1;X<2*n;X++)
        {
            if(X<=n)
            i = X;
            else
            i--;
            k=(char)('a'-1);
            for(j=1;j<2*n;j++)
            {
                if(j>=n-(i-1)&&j<=n+(i-1))
                {
                    if(j<=n)
                    k++;
                    else
                    k--;
                    System.out.print(k);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
