@java.lang.Override
public int getFrequency(java.lang.String word, java.lang.String classification) {
    return this.frequencies.get(classification).get(word);
}