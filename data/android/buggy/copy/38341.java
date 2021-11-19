private java.lang.String getOppositeAlgo(java.lang.String algo) {
    if (algo.equals("HSV")) {
        return "Rgb";
    }else
        if (algo.equals("Rgb")) {
            return "HSV";
        }
    
    return algo;
}