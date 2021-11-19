@java.lang.Override
public void setText(ch.hearc.chatvideo.tools.StringCrypter message) {
    ch.hearc.chatvideo.gui.JPanelChat.getInstance().setText(message.decrypter());
}