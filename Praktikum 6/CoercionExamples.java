public class CoercionExamples {
    public static void main(String[] args) {
        // Program 1: int output = 'a';
        System.out.println("Program 1:");
        int output1 = 'a';
        System.out.println(output1); // 97
        
        // // Program 2: double x = 15.5; int output = x;
        // System.out.println("\nProgram 2:");
        // double x = 15.5;
        // int output2 = x; 
        // System.out.println(output2);  
        
        // Program 3: int y = 25; double output = y;
        System.out.println("\nProgram 3:");
        int y = 25;
        double output3 = y;
        System.out.println(output3); // 25.0
        
        // Program 4: int z = 78; char output = (char)z;
        System.out.println("\nProgram 4:");
        int z = 78;
        char output4 = (char)z;
        System.out.println(output4); // N
        
        // Program 5: char a = 'a'; double output = a;
        System.out.println("\nProgram 5:");
        char a = 'a';
        double output5 = a;
        System.out.println(output5); // 97.0
    }
}
