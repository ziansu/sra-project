public static void increaseIndex() {
    (comunicationStrings.index)++;
    if ((comunicationStrings.index) > 255)
        comunicationStrings.index = 0;
    
}