@java.lang.Override
public void add(java.lang.String word) {
    word = word.toLowerCase();
    addWord(word, 0, root);
}