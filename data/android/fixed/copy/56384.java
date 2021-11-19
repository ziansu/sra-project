public double rejectionPercentage() {
    if ((total) != 0) {
        return ((int) ((100 * (rejections)) / (total)));
    }else {
        return 0;
    }
}