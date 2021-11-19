public int getKillAssists(com.deci.tfstatsrev.TF2Stats.Datatype dt) {
    switch (dt) {
        case ACCUM :
            return accum.KillAssists;
        case MAX :
            return max.KillAssists;
        case MVMACCUM :
            return mvmaccum.KillAssists;
        case MVMMAX :
            return mvmmax.KillAssists;
        default :
            return -1;
    }
}