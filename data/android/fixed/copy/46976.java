public static int setFlags(com.nedap.university.Flag[] flags) {
    int flagsvalue = 0;
    for (com.nedap.university.Flag f : flags) {
        flagsvalue += f.value;
    }
    return flagsvalue;
}