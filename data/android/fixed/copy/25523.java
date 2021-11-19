@java.lang.Override
public void update(ru.javawebinar.webapp.model.Resume r) {
    log.info(("Update " + r));
    java.util.Objects.requireNonNull(r, "Resume must not be null");
    index = mustExist(r.getUuid());
    doUpdate(r);
}