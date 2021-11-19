public void generate() {
    int[] pos = new int[2];
    getLocationOnScreen(pos);
    java.lang.System.out.println(pos[0]);
    if ((mJPTabItems) == null)
        initFromAttribute();
    
}