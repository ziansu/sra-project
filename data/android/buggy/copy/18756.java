@java.lang.Override
public java.lang.String getTitle(int position) {
    return titles[(position % (imgs.length))];
}