@java.lang.Override
public tutor.models.Language getAnswerLanguage() {
    return (getMode()) == (tutor.tasks.dictation.Dictation.Mode.NORMAL) ? getCorrectWord().getWordLang() : getCorrectWord().getTranslationLang();
}