public boolean getBoolean(java.lang.String name) {
    return ((java.lang.Boolean) (get(name, edu.cmu.tetrad.util.ParamDescriptions.instance().get(name).getDefaultValue())));
}