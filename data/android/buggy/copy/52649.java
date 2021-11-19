public void init(com.madara.KnowledgeBase kb, java.lang.String name) {
    jni_init(getCPtr(), 0, kb.getCPtr(), name);
    init();
}