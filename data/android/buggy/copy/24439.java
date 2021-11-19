@java.lang.Override
public boolean isValid(int position) {
    return (position >= 0) && (set.get(position));
}