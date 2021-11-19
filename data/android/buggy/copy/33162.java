@java.lang.Override
public void stop(it.unipd.math.pcd.actors.ActorRef<?> actor) {
    ((it.unipd.math.pcd.actors.AbsActor) (actors.get(actor))).stop();
}