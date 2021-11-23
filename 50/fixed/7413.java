public static boolean isDefined(java.util.HashMap<java.lang.String, java.lang.String> variables, java.lang.String variable) {
    return (variables.size()) != 0 ? (variables.get(variable)) != null : true;
}