private int findMaxInt(java.lang.String[] list) {
    int result = java.lang.Integer.MIN_VALUE;
    for (java.lang.String i : list) {
        int num = java.lang.Integer.parseInt(i);
        if (result < num)
            result = num;
        
    }
    return result;
}