package cake;

public class Main {
    public static void main(String[] args) {
        Cake whiteCake = new Cake.Builder()
                .sugar(3)
                .butter(2)
                .build();

        whiteCake.print();
    }
}
