@java.lang.Override
public int getItemPosition(java.lang.Object object) {
    int index = com.example.makina.polen.ScreenSlidePagerActivity.sc.indexOf(object);
    if (index >= 0)
        return index;
    
    return POSITION_NONE;
}