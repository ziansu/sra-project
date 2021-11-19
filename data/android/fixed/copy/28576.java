@java.lang.Override
public void onMenuSelected(int index) {
    switch (index) {
        case 0 :
            shareRando(holder);
            break;
        case 1 :
            deleteRando(holder);
            break;
        case 2 :
            reportRando(holder);
            break;
        default :
            break;
    }
}