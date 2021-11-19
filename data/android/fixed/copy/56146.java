public static int getNumberClasses(int mechanicsClass) {
    switch (mechanicsClass) {
        case Intelligence.Mechanics.mechanicsClasses.UNDER_BET_CLASS :
            return 1;
        case Intelligence.Mechanics.mechanicsClasses.EQUALS_BET_CLASS :
            return 2;
        case Intelligence.Mechanics.mechanicsClasses.OVER_BET_CLASS :
            return 2;
        case Intelligence.Mechanics.mechanicsClasses.ZERO_STACK_CLASS :
            return 0;
        default :
            return -1;
    }
}