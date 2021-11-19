@java.lang.Override
public int compareTo(Word other) {
    if (equals(other)) {
        return 0;
    }
    return mWord.compareTo(other.mWord);
}