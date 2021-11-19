int toCode() {
    switch (this) {
        case IGP :
            return 0;
        case EGP :
            return 1;
        case INCOMPLETE :
            return 2;
        default :
            throw new java.lang.IllegalArgumentException(("unknown origin code: " + (this)));
    }
}