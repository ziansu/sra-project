public int getGrimyPrice(superchaoran.HerbsUlitimate.constants.Herb herb) {
    if ((herb.grimyPrice) == 0) {
        int temp = new org.powerbot.script.rt6.GeItem(herb.getGrimyId()).price;
        setGrimyPrice(temp);
        return grimyPrice;
    }
    return grimyPrice;
}