@java.lang.Override
public void send(java.lang.String replyMessage, java.lang.String headers) {
    ng.abdlquadri.eventbus.EventBus.send(replyAddress.toString(), replyMessage, headers);
}