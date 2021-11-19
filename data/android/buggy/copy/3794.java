@java.lang.Override
public void visit(com.teamagam.gimelgimel.domain.messages.entity.features.AlertFeature feature) {
    mapAlertToMessage(mMessage, feature);
    mAddAlertRepositoryInteractorFactory.create(feature.getAlert());
}