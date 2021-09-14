package switchcase;

public class gdhk {

    static int[] total(int a, int b) 
    { 
    int[] s = new int[2]; 
     s[0] = a + b; 
      s[1] = a - b; 
        return s; 
    } 

    public static void main(String[] args) 
    { 
    int[] s = total(200, 70); 
    System.out.println("Addition = " + s[0]); 
    System.out.println("Subtraction = " + s[1]); 
    } 
}

