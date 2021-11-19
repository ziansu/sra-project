public static java.lang.String getState(java.lang.String input) {
    java.lang.String state = input.replaceAll("^Node \\{state = State \\[|\\].*$", "");
    return state;
}