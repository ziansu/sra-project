@java.lang.Override
public java.lang.String apply(java.lang.String string) {
    return surroundWithBrackets ? stringQuotation(string) : string;
}