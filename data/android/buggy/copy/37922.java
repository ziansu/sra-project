@java.lang.Override
public boolean remove(java.lang.Object object) {
    int position = indexOf(object);
    if (position == (-1)) {
        return false;
    }else {
        remove(position);
        return true;
    }
}