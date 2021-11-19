@java.lang.Override
public boolean remove(pl.edu.uj.fais.wpz.msom.entities.Model model) {
    if (isReferenced(model)) {
        return false;
    }
    getCurrentSession().delete(model);
    getCurrentSession().clear();
    return true;
}