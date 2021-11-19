public boolean isStarted(com.o3dr.services.android.lib.model.IDroneApi droneApi) {
    return (droneApi != null) && (droneApi.asBinder().pingBinder());
}