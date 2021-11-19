@java.lang.Override
public int compare(AbstractLPuzzle o1, AbstractLPuzzle o2) {
    return java.lang.Double.compare(o1.getDifficulty(), o2.getDifficulty());
}