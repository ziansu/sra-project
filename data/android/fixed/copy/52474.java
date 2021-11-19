public int failurePercentage() {
    if ((total) != 0) {
        return ((int) ((100 * (failures)) / (total)));
    }else {
        return 0;
    }
}