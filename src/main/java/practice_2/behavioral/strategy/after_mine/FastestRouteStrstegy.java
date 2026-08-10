package practice_2.behavioral.strategy.after_mine;

public class FastestRouteStrstegy implements RouteStrategy{
    @Override
    public void buildRoute() {
        System.out.println("Building the fastest route.");
    }
}
