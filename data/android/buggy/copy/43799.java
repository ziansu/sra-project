public float isNullFloat(float target) {
    java.lang.Float object = new java.lang.Float(target);
    if (object != null) {
        return target;
    }
    return 0;
}