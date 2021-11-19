@java.lang.Override
public void doAction(com.nutscape.mc.nunuubot.IncomingMessage m, java.lang.String... args) {
    java.lang.String channel = m.getDestination();
    map.put(args[0], channel);
    nextAction.doAction(m, args[0]);
}