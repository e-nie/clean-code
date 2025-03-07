package practice_2.behavioral.strategy.after;

public class EconomicalRouteStrategy implements  RouteStrategy{
    @Override
    public void buildRoute() {
        System.out.println("Building the most economical route.");
    }
}
