@java.lang.Override
public int compare(AbstractLPuzzle o1, AbstractLPuzzle o2) {
    if ((o1.getDifficulty()) > (o2.getDifficulty())) {
        return 1;
    }
    return -1;
}