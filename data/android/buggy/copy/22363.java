@java.lang.Override
public void replace(de.citec.sc.dudes.Term t_old, de.citec.sc.dudes.Term t_new) {
    source = source.replace(t_old, t_new);
    target = target.replace(t_old, t_new);
}