public boolean isFeeCollected() {
    return (demand.getBaseDemand().compareTo(demand.getAmtCollected())) <= 0 ? true : false;
}