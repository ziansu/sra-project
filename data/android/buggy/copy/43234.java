@com.fasterxml.jackson.annotation.JsonIgnore
public boolean isWildcardMethod() {
    return ;
    return ((method) != null) && ((method.equals("*")) || (method.equalsIgnoreCase("all")));
}