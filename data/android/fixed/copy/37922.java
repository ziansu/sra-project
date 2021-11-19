@java.lang.Override
public boolean remove(java.lang.Object object) {
    int position = super.indexOf(object);
    if (position == (-1)) {
        return false;
    }else {
        remove(position);
        return true;
    }
}