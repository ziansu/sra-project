@org.springframework.web.bind.annotation.RequestMapping(value = "getMessages", produces = "application/json")
public java.util.List<com.jkchat.models.ChatMessage> getMessages() {
    java.lang.String myName = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getName();
    java.util.List<com.jkchat.models.ChatMessage> list = userService.getMessages(myName.toLowerCase(), myName);
    return list;
}