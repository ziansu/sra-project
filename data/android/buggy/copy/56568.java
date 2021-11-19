@java.lang.Override
public java.util.List<pt.uc.dei.aor.project.business.model.IPosition> getIPositions() {
    java.lang.System.out.println("position business: findAll");
    java.lang.System.out.println(positionPersistence.findAllPositions().toString());
    return positionPersistence.findAllPositions();
}