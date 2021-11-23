@java.lang.Override
public boolean isImmediatelyWinningForSpoiler(final boolean isSpoilerAccepting, final boolean isDuplicatorAccepting) {
    return isSpoilerAccepting && (!isDuplicatorAccepting);
}