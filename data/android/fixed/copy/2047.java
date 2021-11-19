@java.lang.Override
public synchronized void addCityToPreloadedList(net.osmand.data.City city) {
    cities.put(city.getId(), city);
}