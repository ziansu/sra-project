private java.util.Map<java.lang.String, com.sachin.risk.common.data.model.EventTypeProperty> getEventTypeProperty(java.lang.Long eventTypeId) {
    if (eventTypeId == null) {
        return null;
    }
    return idPropertyMap.get(eventTypeId);
}