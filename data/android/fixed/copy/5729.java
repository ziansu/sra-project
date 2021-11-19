@java.lang.Override
public void run() {
    if (status) {
        process.setVisibility(View.GONE);
        fab.setVisibility(View.VISIBLE);
    }else {
        process.setVisibility(View.VISIBLE);
        fab.setVisibility(View.GONE);
    }
}