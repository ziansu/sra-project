public int getCurrentCostOfPlace(Brokers.BrokerManagerComponent.BrokerPlace brokerPlace) {
    java.util.List<java.lang.Integer> costList = brokerPlace.getCostList();
    int houses = brokerPlace.getHouses();
    return costList.get((houses == 0 ? 0 : houses - 1));
}