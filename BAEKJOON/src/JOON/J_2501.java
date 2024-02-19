package JOON;

import java.util.Scanner;

public class J_2501 {
    
    static int A , B;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        
        int count = 0;
        for ( int i = 1; i <= A; i++) {
            if (A % i == 0)
                count++;
            if (count == B)
            {
                System.out.println(i);
                break;
            }
        }
        if (count < B) System.out.println(0);
    }
}

