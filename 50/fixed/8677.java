public int getPointCaptures(com.deci.tfstatsrev.TF2Stats.Datatype dt) {
    switch (dt) {
        case ACCUM :
            return accum.PointCaptures;
        case MAX :
            return max.PointCaptures;
    }
    return -1;
}