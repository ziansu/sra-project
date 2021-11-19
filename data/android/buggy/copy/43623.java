@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    switch (position % 4) {
        case 0 :
            return "Ambulance";
        case 1 :
            return "Police";
        case 2 :
            return "Social Contact";
        case 3 :
            return "Telecom";
    }
    return "";
}