java.lang.String getReferenceStack() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("\nReference stack is below.\n");
    for (java.lang.String e : stack) {
        sb.append(e);
    }
    return sb.toString();
}