public boolean hasAnyFailure() {
    return ((failToParse.isEmpty()) && (expired.isEmpty())) && (notExisted.isEmpty()) ? false : true;
}