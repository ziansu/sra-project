public static synchronized com.h102.SpeechRecognizer setupInstance(org.cocos2dx.javascript.AppActivity app) {
    if ((com.h102.SpeechRecognizer.mSharedInstance) == null) {
        com.h102.SpeechRecognizer.app = app;
        return com.h102.SpeechRecognizer.getInstance();
    }
    return com.h102.SpeechRecognizer.mSharedInstance;
}