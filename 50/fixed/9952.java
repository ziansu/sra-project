@java.lang.Override
public java.lang.String toString() {
    return (table) + (nil(idx) ? "" : "^" + (listToParens(idx)));
}