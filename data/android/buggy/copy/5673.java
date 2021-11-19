@java.lang.Override
protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
    Data.Atividade c = new Data.Atividade(user);
    c.setAtividade(atividade);
    c.setDate(((java.util.GregorianCalendar) (date.clone())));
    return c;
}