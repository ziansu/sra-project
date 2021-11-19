public java.util.Set<appguarden.apppal.language.E> vars() {
    java.util.Set<appguarden.apppal.language.E> vars = subject.vars();
    vars.addAll(object.vars());
    return vars;
}