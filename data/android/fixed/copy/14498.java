@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position) {
        case 0 :
            return "Steps";
        case 1 :
            return "Ingredients";
        default :
            return null;
    }
}