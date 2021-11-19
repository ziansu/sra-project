@java.lang.Override
public java.util.List<BombSimulator.Measurement> readAllAndClean() {
    java.util.List<BombSimulator.Measurement> tmp = listOfMeasurement;
    listOfMeasurement.clear();
    return tmp;
}