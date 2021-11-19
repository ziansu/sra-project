public void run() {
    for (java.lang.String guid : guids) {
        try {
            geoObjectService.delete(extSysId, guid);
            setErrors(false);
        } catch (java.lang.Exception e) {
            setErrors(true);
        }
    }
}