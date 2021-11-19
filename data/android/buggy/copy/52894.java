private boolean has(java.lang.String[] args, int index, java.lang.String s) {
    if ((args.length) >= (index + 1))
        return args[index].equalsIgnoreCase(s);
    
    return false;
}