@java.lang.Override
public synchronized void addCityToPreloadedList(net.osmand.data.City city) {
    if (!(cities.containsValue(city))) {
        cities.put(city.getId(), city);
    }
}