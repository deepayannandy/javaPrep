@FunctionalInterface
interface SimpleCalculator{
    public int add(int a, int b);
}
public class lambdaExpressionWithReturnType {
    public static void main(String[] args) {
        SimpleCalculator calc= ( a,  b) ->{
                return a+b;
        };
        System.out.println(calc.add(1,3));
    }
}
