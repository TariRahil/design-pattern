package cake;

public class Cake {
    private final double sugar;
    private final double butter;
    private final double flour;
    private final double bakingPowder;
    private final double milk;
    private final int eggs;
    private final int vanila;
    private final int cherry;

    public static class Builder {
        private double sugar;
        private double butter;
        private double flour;
        private double bakingPowder;
        private double milk;
        private int eggs;
        private int vanila;
        private int cherry;

        public Builder sugar(double cup) {
            this.sugar = cup;
            return this;
        }

        public Builder butter(double cup) {
            this.butter = cup;
            return this;
        }

        public Builder flour(double cup) {
            this.flour = cup;
            return this;
        }

        public Builder bakingPowder(double spoon) {
            this.bakingPowder = spoon;
            return this;
        }

        public Builder milk(double cup) {
            this.milk = cup;
            return this;
        }

        public Builder eggs(int number) {
            this.eggs = number;
            return this;
        }

        public Builder vanila(int spoon) {
            this.vanila = spoon;
            return this;
        }

        public Builder cherry(int number) {
            this.cherry = number;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }

    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.bakingPowder = builder.bakingPowder;
        this.milk = builder.milk;
        this.eggs = builder.eggs;
        this.cherry = builder.cherry;
        this.flour = builder.flour;
        this.vanila = builder.vanila;
    }

    public void print() {
        System.out.println("sugar: " + sugar + "\n" +
                           "butter: " + butter + "\n" +
                           "bakingPowder: " + bakingPowder + "\n" +
                           "milk: " + milk + "\n" +
                           "egg: " + eggs + "\n" +
                           "cherry: " + cherry + "\n" +
                           "flour: " + flour + "\n" +
                           "vanila: " + vanila + "\n" );
    }
}
