@java.lang.Override
public ge.edu.freeuni.sdp.iot.sensor.bath_humidity.model.Humidity getLast(java.lang.String houseId) {
    if (!(measurements.get(houseId).isEmpty()))
        return measurements.get(houseId).get(0);
    else
        return null;
    
}