class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public  int add(int a, int b, int c){
        return a+b+c;
    }
    public  double add(double a, double b){
        return a+b;
    }
}
public class methodOverloading {
    public static void main(String args[]){
        Calculator calc= new Calculator();
        System.out.println(calc.add(2,4));
        System.out.println(calc.add(2,4,5));
        System.out.println(calc.add(2.12,4));
    }
}
