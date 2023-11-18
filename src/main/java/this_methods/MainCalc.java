package this_methods;

public class MainCalc {
    public static void main(String[] args) {

    Calculator.printRes();

    Calculator c = new Calculator(4, 6);
    Calculator c1 = new Calculator(3, 7);
    c1.Calculate(2,5,'+');
    Calculator.printRes();



    }

    public static void printAny(){
        System.out.println("Any");
    }
}
