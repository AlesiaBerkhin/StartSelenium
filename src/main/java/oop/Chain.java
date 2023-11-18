package oop;

public class Chain {
    public static void main(String[] args) {

        int a = 0, b = 0;
        a = sum(3,4);
        b = a + sum(2,6);

      //  char c = str.toLowerCase().trim().substring(3, 8).charAt(2);
        String str = "      Hello world     ";
      // str =  str.trim();
      //  str = str.toLowerCase();

      //  System.out.println(str);

       //  = str.toLowerCase().trim().substring(3,8).charAt(2);
        System.out.println(str);
    }

    public static int sum(int x, int y){
        return x + y;
    }
}
