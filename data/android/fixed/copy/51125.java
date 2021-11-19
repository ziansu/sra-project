public org.springframework.web.servlet.mvc.method.annotation.SseEmitter subscribe(java.lang.String username) {
    org.springframework.web.servlet.mvc.method.annotation.SseEmitter sseEmitter = new org.springframework.web.servlet.mvc.method.annotation.SseEmitter(0L);
    this.subscriptions.put(username, sseEmitter);
    return sseEmitter;
}