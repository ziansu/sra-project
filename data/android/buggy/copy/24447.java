public static java.lang.String getRandomStr(int length) {
    int[] randoms = org.fczm.common.util.MathTool.getRandom(length, 9);
    java.lang.String str = "";
    for (int i : randoms)
        str += i;
    
    return str;
}