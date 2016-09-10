 
package Problem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.Scanner;
        

public class A_SquareOfANumberTest {
    
    public A_SquareOfANumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() throws Exception {
        //System.out.println("main");
        //String[] args = null;
        //A_SquareOfANumber.main(args);
        //fail("The test case is a prototype.");
    }

    @Test 
    public void testSquare1() throws FileNotFoundException{
        
        Scanner scInput = new Scanner(new File("src/TestCases/A1.in"));
        Scanner scOutput = new Scanner (new File("src/TestCases/A1.out"));
        
        int TestCases = scInput.nextInt();
        while(TestCases > 0){
        int num = scInput.nextInt();
        int actualResult = A_SquareOfANumber.square(num);
        int expectedResult = scOutput.nextInt();
        assertEquals(expectedResult,actualResult);
        TestCases--;
        
        }
        System.out.println("###############");
        System.out.println("Test Case 1; Square Method Test Passed");
        System.out.println("###############");
    }
@Test 
    public void testSquare2() throws FileNotFoundException{
        
        Scanner scInput = new Scanner(new File("src/TestCases/A2.in"));
        Scanner scOutput = new Scanner (new File("src/TestCases/A2.out"));
        
        int TestCases = scInput.nextInt();
        while(TestCases > 0){
        int num = scInput.nextInt();
        int actualResult = A_SquareOfANumber.square(num);
        int expectedResult = scOutput.nextInt();
        assertEquals(expectedResult,actualResult);
        TestCases--;
        
        }
        System.out.println("###############");
        System.out.println("Test Case 2; Square Method Test Passed");
        System.out.println("###############");

}
@Test 
    public void testSquare3() throws FileNotFoundException{
        
        Scanner scInput = new Scanner(new File("src/TestCases/A3.in"));
        Scanner scOutput = new Scanner (new File("src/TestCases/A3.out"));
        
        int TestCases = scInput.nextInt();
        while(TestCases > 0){
        int num = scInput.nextInt();
        String actualResult="";
        if(num>1000)
            actualResult= "TOO BIG";
        else if(num<0)
            actualResult="INVALID";
        else 
            actualResult = Integer.toString(A_SquareOfANumber.square(num));
        String expectedResult=scOutput.nextLine();
        assertEquals(expectedResult,actualResult);
        TestCases--;
        }
        System.out.println("###############");
        System.out.println("Test Case 3; Square Method Test Passed");
        System.out.println("###############");


}}
    
    
 
    
    
    

