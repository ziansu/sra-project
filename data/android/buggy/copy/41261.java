public AbstractSymbol lub(class_c c1, class_c c2) {
    if (isSupertypeOf(c1, c2)) {
        return c1.getName();
    }else {
        return lub(getClass_c(c1.getParent()), c2);
    }
}