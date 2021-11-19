boolean contains(N queryValue) {
    return ((queryValue.compareTo(end)) < 0) && ((queryValue.compareTo(start)) > 0);
}