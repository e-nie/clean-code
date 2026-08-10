package practice_2.behavioral.strategy.after_mine;

public class LeastTurnsRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Building the route with the least turns.");

    }
}
