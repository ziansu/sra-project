@java.lang.Override
public boolean addRouteModel(casak.ru.geofencer.domain.model.Route model) {
    casak.ru.geofencer.domain.model.Route result = casak.ru.geofencer.storage.converters.RouteConverter.convertToStorageModel(model);
    result.update();
    return true;
}