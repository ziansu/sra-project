@java.lang.Override
public boolean clear() {
    T[] empty = ((T[]) (new T()));
    array = empty;
    return false;
}