package practice_2.behavioral.strategy.after_mine;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new EconomicalRouteStrategy());
        navigator.buildRoute();

        navigator.setStrategy(new LeastTurnsRouteStrategy());
        navigator.buildRoute();

        navigator.setStrategy(new FastestRouteStrstegy());
        navigator.buildRoute();
    }


}
