private boolean isSeparator(char read) {
    switch (read) {
        case ' ' :
        case '\t' :
            return true;
    }
    return false;
}