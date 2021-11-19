@java.lang.Override
public void onTick(long tleft) {
    final long mleft = tleft / 60000;
    final long sleft = (tleft - (mleft * 60000)) / 1000;
    bReload.setText(java.lang.String.format("%d:%02d", mleft, sleft));
}