@java.lang.Override
public void onEnable() {
    io.github.mariandcrafter.devathlon2.runde3.Main.instance = this;
    getMessageSender().send(new io.github.mariandcrafter.bukkitpluginapi.messages.Message.Builder("Hello World!").setConsole(true).build());
    java.lang.System.out.println("2. Devathlon, 3. Runde - GreenGlowPixel-Team - Plugin enabled!");
}