@java.lang.Override
public boolean isTrim(int index) {
    if ((trimMap) == null) {
        return false;
    }
    return trimMap.get(index);
}