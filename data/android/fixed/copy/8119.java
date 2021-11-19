public uk.co.nickthecoder.itchy.Director createDirector(uk.co.nickthecoder.itchy.util.ClassName className) throws javax.script.ScriptException {
    uk.co.nickthecoder.itchy.script.ScriptLanguage language = getLanguage(uk.co.nickthecoder.itchy.script.ScriptManager.getExtension(className.name));
    return language.createDirector(className);
}