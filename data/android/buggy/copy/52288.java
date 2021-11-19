boolean match(char c) {
    return ((characters.contains(c)) || (!(negated.contains(c)))) || (all);
}