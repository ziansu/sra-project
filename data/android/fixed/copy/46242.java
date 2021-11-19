public static me.lerch.alexa.morse.skill.model.MorseCode encode(java.lang.String line) throws java.io.IOException {
    return me.lerch.alexa.morse.skill.manager.MorseApiManager.encode(line, me.lerch.alexa.morse.skill.utils.SkillConfig.getReadOutLevelNormal());
}