public class OperatorsDemo{
    void add(int a,int b){
        int sum =a + b;
        System.out.println("Addition:"+sum);
    }
      
      int multiply(int a, int b){
         return a *b;
      }

      public static void main(String[]args){
         
         byte a = 30, b = 15;
         int result = a+b;
         System.out.println("Arithemetic Promotion Result :" +result);

         int x = 9, y =17;
         System.out.println("x + y ="+(x + y));
         System.out.println("x - y ="+(x - y));
         System.out.println("x * y ="+(x * y));
         System.out.println("x / y ="+(x / y));
         System.out.println("x % y ="+(x % y));

         OperatorsDemo obj = new OperatorsDemo();
         obj.add(11,22);
         int product = obj.multiply(3,8);
         System.out.println("Multiplication: " +product);
         

      }
}