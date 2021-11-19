@java.lang.Override
public synchronized void init(javax.annotation.processing.ProcessingEnvironment env) {
    super.init(env);
    typeUtils = processingEnv.getTypeUtils();
    elementUtils = processingEnv.getElementUtils();
    filer = processingEnv.getFiler();
    messager = processingEnv.getMessager();
}