public class Main {

    public static void main(String[] args) {
	BinOps bins = new BinOps();
        System.out.println("Результат умножения");
        System.out.println(bins.mult("01", "101"));
        System.out.println("Результат сложения");
        System.out.println(bins.sum("01", "101"));
    }
}
