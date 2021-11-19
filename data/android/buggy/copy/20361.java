public java.lang.String getNextId() {
    java.lang.String next = java.lang.Integer.toString(this.nextId);
    do {
        this.nextId += 1;
    } while (!(isIdFree(java.lang.Integer.toString(this.nextId))) );
    return next;
}