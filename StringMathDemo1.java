public class StringMathDemo1{
    public static void main(String[]args){
        String str1 ="Vaishnavi";
        String str2 ="chaudhari";

        String str3 = str1.concat(" "+str2);

        System.out.println("concatenation:" +str3);
        System.out.println("Length of str1:" +str1.length());
        System.out.println("Character at index 1:" +str1.charAt(1));
        System.out.println("Substring of str2(0-3):" +str2.substring(0,5));
        System.out.println("equals? str1 and str2:" +str1.equals(str2));
        System.out.println("uppercase str1:" +str1.toUpperCase());
        System.out.println("lowercase str1:" +str1.toLowerCase());

        double a= 10.0;
        double b= 4.5;

        System.out.println("square root of a: " +Math.sqrt(a));
        System.out.println("a raised to b: " +Math.pow(a,b));
        System.out.println("Max of a and b: " +Math.max(a,b));
        System.out.println("Min of a and b: " +Math.min(a,b));
        System.out.println("Random number(1-10): " +Math.random());
        System.out.println("Random number(10-50): " +(10 + Math.random()*(20-10)));
        System.out.println("Random number(60-100): " +(1 + Math.random()*(100-1)));
        System.out.println("Ceil of b:" + Math.ceil(b));
        System.out.println("floor of b:" + Math.floor(b));
        System.out.println("round of b:" + Math.round(b));
        
        }
}