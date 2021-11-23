public java.lang.String buildSpeech(java.lang.String speech) {
    return twitter.interpreter.Actor.SPEECH_STRING.replace("$speechtext$", speech);
}