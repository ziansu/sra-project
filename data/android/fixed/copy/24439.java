@java.lang.Override
public boolean isValid(int position) {
    return (position >= (offset)) && (set.get((position - (offset))));
}