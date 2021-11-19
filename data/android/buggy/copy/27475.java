@java.lang.Override
public int getItemCount() {
    int count = 0;
    try {
        count = posts.length();
    } catch (java.lang.NullPointerException ex) {
        ex.printStackTrace();
    }
    return count;
}