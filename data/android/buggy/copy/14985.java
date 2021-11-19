int toCode() {
    switch (this) {
        case IGP :
            return 1;
        case EGP :
            return 2;
        case INCOMPLETE :
            return 3;
        default :
            throw new java.lang.IllegalArgumentException(("unknown origin code: " + (this)));
    }
}