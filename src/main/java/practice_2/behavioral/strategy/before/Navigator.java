package practice_2.behavioral.strategy.before;

class Navigator {
    private String strategy;

    public Navigator(String strategy) {
        this.strategy = strategy;
    }

    public void buildRoute() {
        if (strategy.equals("fastest")) {
            System.out.println("Building the fastest route.");
        } else if (strategy.equals("economical")) {
            System.out.println("Building the most economical route.");
        } else if (strategy.equals("leastTurns")) {
            System.out.println("Building the route with the least turns.");
        }
    }
}