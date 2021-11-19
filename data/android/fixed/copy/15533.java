@java.lang.Override
public synchronized boolean addToBlacklist(final java.lang.String blackWord) {
    return blacklist.add(blackWord);
}