@java.lang.Override
public void onReadingProgressChanged(net.zionsoft.obadiah.model.domain.VerseIndex verseIndex) {
    if (((currentBook) == (verseIndex.book())) && ((currentChapter) == (verseIndex.chapter()))) {
        currentVerse = verseIndex.verse();
    }
}