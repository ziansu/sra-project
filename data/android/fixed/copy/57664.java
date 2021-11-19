@java.lang.Override
public int getSize(int position) {
    switch (position % 2) {
        case 0 :
            return MetroView.SIZE_SMALL;
        case 1 :
            return MetroView.SIZE_MIDDLE;
        case 2 :
            return MetroView.SIZE_BIG;
    }
    return MetroView.SIZE_BIG;
}