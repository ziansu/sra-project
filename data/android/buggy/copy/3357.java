@java.lang.Override
public void saveRelation(final io.subutai.common.security.relation.model.Relation relation) {
    relationDataService.updateBatch(com.google.common.collect.Lists.<java.lang.Object>newArrayList(relation.getSource(), relation.getTarget(), relation.getTrustedObject(), relation));
}