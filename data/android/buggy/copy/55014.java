public void createActorRouterMap(java.util.ArrayList<java.lang.String> userGroups) {
    for (java.lang.String groupName : userGroups) {
        akka.actor.ActorRef actor = AllActors.system.actorOf(akka.actor.Props.create(AllActors.ActorRouter.class), groupName);
        controllers.SystemController.userGroupActorRouterMap.put(groupName, actor);
    }
}