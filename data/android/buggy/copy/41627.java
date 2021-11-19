@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 0 :
            return "Doge";
        case 1 :
            return "Vanilla";
        case 2 :
            return "Paint!";
        case 3 :
            return "Sticker";
        default :
            return "Page" + position;
    }
}