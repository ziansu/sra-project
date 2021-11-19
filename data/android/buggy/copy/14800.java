java.lang.String drop() {
    return ("DROP TABLE IF EXISTS " + (this.name)) + ";";
}