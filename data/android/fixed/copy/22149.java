public int getId(java.lang.String name) {
    java.lang.Integer id = mIdList.get(name);
    return id != null ? id : 0;
}