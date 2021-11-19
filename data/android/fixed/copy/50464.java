private void addToOpposingLiberties(com.pololanguage.ninedragongo.Stone stone) {
    for (com.pololanguage.ninedragongo.Chain chain : getNeighborChains(stone.coords, stone.color.getOther())) {
        chain.addLiberty(stone.coords);
    }
}