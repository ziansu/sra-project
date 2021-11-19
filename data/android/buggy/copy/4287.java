private int getFileStart(java.lang.String fileName) {
    for (java.lang.String[] file : this.files) {
        if ((file[0]) == fileName)
            return java.lang.Integer.parseInt(file[1]);
        
    }
    return -1;
}