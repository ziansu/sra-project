public java.lang.Object get(java.lang.String name) {
    return get(name, edu.cmu.tetrad.util.ParamDescriptions.instance().get(name).getDefaultValue());
}