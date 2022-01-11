public class App {
    public static void main(String[] args) throws Exception {
       //Example 1
       System.out.println("Example 1");
       System.out.println("Hello, I am [Yi Lin]!");

       //Example 3
       System.out.println("Example 2");
       String moduleCode = "CSC1009";
       switch(moduleCode)
       {
           case "AUD":
               System.out.println("Australian dollar");
               break;
           case "MYR":
               System.out.println("Malaysian ringgit");
               break;
           case "IDR":
               System.out.println("Indonesian rupiah");
               break;
           case "CSC1009":
               System.out.println("Object-Oriented Programming");
               break;
           default:
               System.out.println("Unknown Currency");
               break;
       }
       System.out.println("After switch");

       //Example 4
       System.out.println("Example 3");
       for (int i = 102; i >= 66; i--) {
           if (i % 2 != 0) {
               System.out.print(i + " ");
           }
       }
    }
}
