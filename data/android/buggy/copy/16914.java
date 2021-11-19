@java.lang.Override
public void vicinityOverlapNotice(com.esbjon.entities.MovingEntity overlapEntity) {
    java.lang.System.out.println(("Squad's vicinity now overlaps the vicinity of " + (overlapEntity.getClass().getSimpleName())));
}