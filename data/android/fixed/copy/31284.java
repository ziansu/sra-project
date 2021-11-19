@java.lang.Override
public com.sfparks.model.Park call(com.google.gson.JsonObject object) {
    return com.sfparks.model.ParksModule.getParkFromRecord(object, jsonParser, latLng);
}