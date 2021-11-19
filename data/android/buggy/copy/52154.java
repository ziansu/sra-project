private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException, java.lang.ClassNotFoundException {
    out.defaultWriteObject();
    featuresClass = features.getClass().getName();
    if (getDebug())
        java.lang.System.err.println(("AbstractImageFilter:: custom writeObject method called, saving features' classname as " + (featuresClass)));
    
}