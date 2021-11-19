@java.lang.Override
public void onApplicationEvent(org.springframework.web.socket.messaging.SessionDisconnectEvent event) {
    org.exampleapps.greatbig.web.websocket.dto.MessageDTO messageDTO = new org.exampleapps.greatbig.web.websocket.dto.MessageDTO();
    messageDTO.setSessionId(event.getSessionId());
    messageDTO.setPage("logout");
    messagingTemplate.convertAndSend("/topic/message", messageDTO);
}