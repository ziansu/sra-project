@java.lang.Override
public boolean contains(java.lang.Object obj) {
    for (int j = 0; j < (array.length); j++) {
        if (obj == (array[j])) {
            return true;
        }
    }
    return false;
}