public int hashCode() {
    int result = this.hashCode();
    result = (31 * result) + ((numCategories) != null ? numCategories.hashCode() : 0);
    return result;
}