public void saveModel() throws java.lang.Exception {
    if ((model) != null) {
        weka.core.SerializationHelper.write("weka.model", model);
    }else {
        java.lang.System.out.println("Model is null");
    }
}