@java.lang.Override
public java.util.List<ru.itmo.modeling.tatianagorbunova.wind.model.Measurement> getMeasurements() {
    readExcel();
    return measurements;
}