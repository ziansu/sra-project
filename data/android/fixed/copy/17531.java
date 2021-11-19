@java.lang.Override
public void run() {
    util.AnnotationDataType[] annotations = model.getAnnotations();
    uploadTab.addNewExpPanel(annotations);
}