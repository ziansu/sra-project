@java.lang.Override
public int compare(dat255.refugeemap.model.db.Event e1, dat255.refugeemap.model.db.Event e2) {
    return strComp.compare(e1.getTitle(), e2.getTitle());
}