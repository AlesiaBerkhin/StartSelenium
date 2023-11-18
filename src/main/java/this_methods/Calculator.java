package this_methods;

public class Calculator {

    // characteristics - fields - properties - data members

    int a;
    int b;
    static int res = 0;

    public static void printRes(){
        System.out.println("Result = " + res);
        System.out.println();
    }

    public void Calculate(int a, int b, char action){

        switch (action){
            case '+' : res = this.a + this.b; break;
            case '-' : res = a +-b; break;
        }
    }

    public Calculator(int a, int b){
        this.a = a;
    }


}
