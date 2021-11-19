public void init(com.madara.Variables vars, java.lang.String name) {
    jni_init(getCPtr(), 1, vars.getCPtr(), name);
    init();
}