import java.util.*;

class UserInputDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream  
        
        // System.out.print("Enter first number- ");
        // int a = sc.nextInt();
        
        // System.out.print("Enter second number- ");
        // int b = sc.nextInt();
        
        System.out.print("Enter third number- ");
        // int c = sc.nextInt();
        
        // int d = a + b + c;
        
        // System.out.println("Total= " + d);

        String abc = sc.nextLine();
        System.out.println("Total= " + abc);

    }
}

//int nextInt()	It is used to scan the next token of the input as an integer.
//float nextFloat()	It is used to scan the next token of the input as a float.
//double nextDouble()	It is used to scan the next token of the input as a double.
//byte nextByte()	It is used to scan the next token of the input as a byte.
//String nextLine()	Advances this scanner past the current line.
//boolean nextBoolean()	It is used to scan the next token of the input into a boolean value.
//long nextLong()	It is used to scan the next token of the input as a long.
//short nextShort()	It is used to scan the next token of the input as a Short.
//BigInteger nextBigInteger()	It is used to scan the next token of the input as a BigInteger.
//BigDecimal nextBigDecimal()	It is used to scan the next token of the input as a BigDecimal.