@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isWildcardMethod() {
    return ((method) != null) && ((method.equals("*")) || (method.equalsIgnoreCase("all")));
}