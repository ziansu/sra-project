@java.lang.Override
public void onClick(android.view.View view) {
    if ((index == 3) || (index == 4)) {
        return ;
    }
    viewPager.setCurrentItem(index);
}