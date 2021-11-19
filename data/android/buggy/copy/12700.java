@java.lang.Override
public <S extends com.netbuilder.entities.Payment> S insert(S arg0) {
    mongoOperation.save(arg0);
    return null;
}