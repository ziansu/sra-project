public java.lang.Integer sourceToTarget(java.lang.Boolean value) {
    int result = -1;
    if (value) {
        result = java.lang.Integer.parseInt(this.source.getValue());
    }
    return result;
}