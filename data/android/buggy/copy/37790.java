protected net.dv8tion.jda.core.entities.Message announceWinner() {
    net.dv8tion.jda.core.MessageBuilder builder = new net.dv8tion.jda.core.MessageBuilder();
    return builder.append(("The winner of this tournament is: " + (_matchedOpponents.getFirst()))).build();
}