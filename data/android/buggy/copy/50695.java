@java.lang.Override
public void onPageScrolled(int position, float arg1, int arg2) {
    if (position == 0) {
        myViewPager.setCurrentItem(1);
    }else
        if (position >= 3) {
            myViewPager.setCurrentItem(3);
        }
    
}