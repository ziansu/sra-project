public mpicbg.models.CoordinateTransform createTransform() throws java.lang.IllegalArgumentException {
    if ((instance) == null) {
        instance = validationInstance;
    }else {
        instance = createAndInitTransform();
    }
    return instance;
}