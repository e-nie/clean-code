package practice_2.creational.builder.after;

class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        // Нам нужны не просто сеттеры, а возможность цепочки вызовов

        // pizza.setDough()
        // pizza.setSauce()

        // перейти к цепочке вызовов

        // Pizza.Builder().setDough().setSauce()

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, " + topping + " topping.";
    }
}


