public org.springframework.web.servlet.mvc.method.annotation.SseEmitter subscribe(java.lang.String username) {
    org.springframework.web.servlet.mvc.method.annotation.SseEmitter sseEmitter = new org.springframework.web.servlet.mvc.method.annotation.SseEmitter();
    this.subscriptions.put(username, sseEmitter);
    return sseEmitter;
}