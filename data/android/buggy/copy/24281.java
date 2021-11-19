@java.lang.Override
public void doAction(com.nutscape.mc.nunuubot.IncomingMessage m, java.lang.String... args) {
    java.lang.String channel = m.getDestination();
    map.put(m.getNick(), channel);
    nextAction.doAction(m, args[0]);
}