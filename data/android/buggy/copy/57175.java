int getOrient(int i) {
    if (i == (-1)) {
        java.lang.System.out.println(("Orient: " + (java.util.Arrays.toString(panelOrient))));
        return 0;
    }
    return panelOrient[i];
}