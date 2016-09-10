
package Problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A_SquareOfANumber {
    public static void main(String[]args) throws FileNotFoundException{
    
        Scanner sc = new Scanner(new File("src/TestCases/A3.in"));
    
    int TestCases = sc.nextInt();
    while(TestCases >0){
    if(TestCases > 0 && TestCases <= 1000){
    int num = sc.nextInt();
    System.out.println(square(num));
    TestCases--;
    }
    else if (TestCases>1000){
      int num = sc.nextInt();
      System.out.println("TOO BIG");
      TestCases--;
    }
    else if(TestCases<0){
    int num = sc.nextInt();
      System.out.println("INVALID");
      TestCases--;
    }
    }
    }
    public static int square(int num){
        return num * num;
    }
    }