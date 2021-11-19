public static CS3213.RequiredWordsCircularShift create(CS3213.ReadableWordsCollection requiredWords, CS3213.ReadableWordsCollection ignoredWords) {
    assert (requiredWords != null) && (ignoredWords != null);
    return new CS3213.RequiredWordsCircularShift(requiredWords, ignoredWords);
}