package model.factory;

import model.Results;
import model.rank.Ranks;

public class Competition {
    private FactoryRanks factory;

    public Competition(FactoryRanks factory) {
        this.factory = factory;
    }

    public Results result(Ranks sportsman) {
        Results action = factory.action(sportsman);
        int squat = action.squat();
        int bench = action.benchpress();
        int deadlift = action.deadlift();

        int sum = squat + bench + deadlift;

        System.out.println("The sum " + action + " is " + sum);

        check(sportsman, sum);

        return action;
    }

    public void check(Ranks sport, int sum) {
        if (sport == Ranks.MS)
            if (sum >= 450)
                System.out.println("You have been verified. You are rise up");
            else
                System.out.println("You are strong not enough. Your rank don't change");

        if (sport == Ranks.CMS)
            if (sum >= 350)
                System.out.println("You have been verified. You are rise up");
            else
                System.out.println("You are strong not enough. Your rank don't change");

        if (sport == Ranks.FIRST_RANK)
            if (sum >= 250)
                System.out.println("You have been verified. You are rise up");
            else
                System.out.println("You are strong not enough. Your rank don't change");
    }
}
