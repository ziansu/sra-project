static java_cup.non_terminal create_new(java.lang.String prefix) throws java_cup.internal_error {
    if (prefix == null)
        prefix = "NT$";
    
    return new java_cup.non_terminal((prefix + ((java_cup.non_terminal.next_nt)++)));
}