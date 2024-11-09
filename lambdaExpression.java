@FunctionalInterface
interface Car{
    public void run(int Speed);
}
public class lambdaExpression {
    public static void main(String[] args) {
        Car lamborgini= (Speed)-> System.out.println("Hey I am running at "+ Speed);
        lamborgini.run(30);
    }
}
