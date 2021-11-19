public dist.esper.event.EventProperty getProperty(java.lang.String propName) {
    for (dist.esper.event.EventProperty p : propList) {
        if (p.name.equals(propName)) {
            return p;
        }
    }
    return null;
}