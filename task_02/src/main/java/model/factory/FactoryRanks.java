package model.factory;

import model.Results;
import model.rank.CMS;
import model.rank.First_rank;
import model.rank.MS;
import model.rank.Ranks;

public class FactoryRanks {
    public Results action(Ranks rank){

        Results work = null;
        switch (rank) {
            case FIRST_RANK:
                work = new First_rank();
                break;
            case CMS:
                work = new CMS();
                break;
            case MS:
                work = new MS();
                break;
        }
        return work;
    }
}
