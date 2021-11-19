public void setName(java.lang.String name) {
    if (name.equals("")) {
        throw new java.lang.IllegalArgumentException();
    }
    this.name = name;
}