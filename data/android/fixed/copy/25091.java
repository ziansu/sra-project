@java.lang.Override
public synchronized boolean removeFromBlacklist(final java.lang.String blackWord) {
    return blacklist.remove(blackWord);
}