class OuterClass { 
    static int x = 1; 
    int y = 2; 
    private static int private_mem = 3; 
    
    static class NestedClass { 
        void display() { 
        System.out.println("x = " + x); 
        System.out.println("private_mem = " + private_mem);
        // cannot reference non-static members here 
        } 
    } 
} 

public class Main { 
    public static void main(String[] args) { 
        OuterClass.NestedClass nestedObject = new OuterClass.NestedClass(); 
        nestedObject.display(); 
    } 
}
