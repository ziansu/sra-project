public boolean isMsgPrompt(java.lang.String msg) {
    if ((msg != null) && (msg.startsWith(SecurityJsBridgeBundle.PROMPT_START_OFFSET))) {
        return true;
    }else {
        return false;
    }
}