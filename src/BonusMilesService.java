public class BonusMilesService {
    public int calculate(int cost) {
        int price = 10_000;
        byte mile = 20;
        int bonus = cost / mile;
        return bonus;
    }

}

