package practice_2.behavioral.strategy.after;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new FastestRouteStrategy());
        navigator.buildRoute();

        navigator.setStrategy(new LeastTurnsRouteStrategy());
        navigator.buildRoute();

        navigator.setStrategy(new EconomicalRouteStrategy());
        navigator.buildRoute();
    }
}
