@java.lang.Override
public void onPageSelected(int position) {
    getWindow().getDecorView().setBackgroundColor(colors[(position % (colors.length))]);
}