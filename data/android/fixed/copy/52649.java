public void init(com.madara.KnowledgeBase kb, long id) {
    jni_init(getCPtr(), 0, kb.getCPtr(), id);
    init();
}