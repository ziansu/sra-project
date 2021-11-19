@java.lang.Override
public synchronized java.util.List<BombSimulator.Measurement> readAllAndClean() {
    java.util.List<BombSimulator.Measurement> tmp = new java.util.ArrayList(listOfMeasurement);
    listOfMeasurement.clear();
    return tmp;
}