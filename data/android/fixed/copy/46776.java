public void addException(java.lang.Throwable t) {
    tw.com.triplei.commons.Message message = new tw.com.triplei.commons.Message("EXCEPTION", t.getMessage());
    this.messages.add(message);
}