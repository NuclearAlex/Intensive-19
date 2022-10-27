import model.factory.Competition;
import model.factory.FactoryRanks;
import model.rank.Ranks;

public class Runner {
    public static void main(String[] args) {
        Competition competition = new Competition(new FactoryRanks());

        competition.result(Ranks.CMS);
    }
}
