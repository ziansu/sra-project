@java.lang.Override
public boolean needsScores() {
    return (valuesSources) == null ? false : valuesSources.needsScores();
}