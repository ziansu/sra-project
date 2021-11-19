@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    java.util.Locale l = java.util.Locale.getDefault();
    switch (position) {
        case 0 :
            return "תפריט";
        case 1 :
            return "ביצוע הזמנה";
    }
    return null;
}