public boolean isJumpWater(int tailSz, double pct) {
    if (sd.isJumpWater(tailSz, pct)) {
        sd.PrintStockData();
        return true;
    }else {
        return false;
    }
}