@java.lang.Override
public boolean contains(java.lang.String word) {
    return store.contains(new BSTDictionary.KVP(word, null));
}