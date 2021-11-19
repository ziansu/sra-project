@java.lang.Override
public boolean isPropertyFound(java.lang.String kanjiKeyWord, com.kanji.Row.KanjiInformation kanjiInformation) {
    return (kanjiInformation != null) && (doesWordContainSearchedWord(kanjiInformation.getKanjiKeyword(), removeDiacritics(kanjiKeyWord), options));
}