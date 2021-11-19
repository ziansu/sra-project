@java.lang.Override
public java.util.List<ru.itmo.modeling.tatianagorbunova.wind.model.Measurement> getMeasurements() {
    if ((measurements.size()) == 0)
        readExcel();
    
    return measurements;
}