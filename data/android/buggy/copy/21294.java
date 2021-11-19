public static com.cdd.bao.template.Vocabulary globalInstance() throws java.io.IOException {
    synchronized(com.cdd.bao.template.Vocabulary.mutex) {
        if ((com.cdd.bao.template.Vocabulary.singleton) == null)
            com.cdd.bao.template.Vocabulary.singleton = new com.cdd.bao.template.Vocabulary();
        
        return com.cdd.bao.template.Vocabulary.singleton;
    }
}