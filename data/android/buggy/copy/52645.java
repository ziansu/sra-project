private static void copyAnnotations(org.teavm.model.util.AnnotationContainerReader src, org.teavm.model.util.AnnotationContainer dst) {
    for (org.teavm.model.util.AnnotationReader annot : src.all()) {
        dst.add(org.teavm.model.util.ModelUtils.copyAnnotation(annot));
    }
}