@java.lang.Override
public int getCount() {
    if ((distinctRecords.size()) > 0) {
        return distinctRecords.size();
    }else {
        return 1;
    }
}