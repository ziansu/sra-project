public static Word find(int id) {
    try {
        return Word.dictionary.get((id - 1));
    } catch (java.lang.IndexOutOfBoundsException e) {
        return null;
    }
}