@java.lang.Override
public org.latinolib.eval.CrossValidator.FoldData<T, U> next() {
    return getFold((((current)++) + 1));
}