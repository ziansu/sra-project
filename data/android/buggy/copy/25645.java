public net.dv8tion.jda.core.entities.TextChannel getGreetingChannel() {
    return getAsGuild().getTextChannelById(((java.lang.String) (Setting.GREET.get(this))));
}