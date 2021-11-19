@java.lang.Override
protected boolean hasDone() {
    if (((step) >= (maxduration)) || (!(result.equalsIgnoreCase("no")))) {
        return true;
    }
    return false;
}