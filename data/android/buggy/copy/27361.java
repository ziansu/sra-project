@java.lang.Override
public int getCount() {
    try {
        return list.size();
    } catch (java.lang.NullPointerException e) {
        return 0;
    }
}