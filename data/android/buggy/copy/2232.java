public static boolean hasId(int id) {
    synchronized(joshua.corpus.Vocabulary.lock) {
        id = java.lang.Math.abs(id);
        return id <= (joshua.corpus.Vocabulary.idToString.size());
    }
}