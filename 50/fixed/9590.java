public int SetL(java.lang.String x) {
    if ((x.length()) == 1)
        x = "0" + x;
    
    test1.L = x;
    jL.setText(x);
    return 1;
}