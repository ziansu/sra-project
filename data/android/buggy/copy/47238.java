public void translate(java.lang.String toTranslate, boolean autoCorrection) {
    if ((toTranslate == null) || (toTranslate.equals("")))
        return ;
    
    new com.ece251.gongxl.transcanner.Translator.TranslationThread(toTranslate, autoCorrection).start();
}