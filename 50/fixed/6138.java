public int getCount() {
    return java.lang.Integer.parseInt(uniqueResult(("select count(*) from " + (MODEL_NAME)), null).toString());
}