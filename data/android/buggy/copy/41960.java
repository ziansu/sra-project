protected net.anomalyxii.werewolves.parser.Vitality getVitalityForCharacter(java.lang.Character character) {
    return characterVitalityMap.getOrDefault(character, Vitality.ALIVE);
}