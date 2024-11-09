@FunctionalInterface
interface A{
    public void Show();
}
public class functionalInterface {
    public static void main(String[] args) {
        //functional interface using inner class
        A obja= new A() {
            @Override
            public void Show() {
                System.out.println("Hey I am Show...");
            }
        };
        obja.Show();
    }
}
