public static java.lang.String convertDamageLevel(int number) {
    if ((number == 4) || (number == 1)) {
        return com.fu.group10.capstone.apps.teachermobileapp.utils.Constants.HIGH;
    }else
        if (number == 2) {
            return com.fu.group10.capstone.apps.teachermobileapp.utils.Constants.MEDIUM;
        }else {
            return com.fu.group10.capstone.apps.teachermobileapp.utils.Constants.LOW;
        }
    
}