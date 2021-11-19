@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    arguments_content.stream().forEach(( argument_raw) -> sb.append(argument_raw));
    return sb.toString().substring(1);
}