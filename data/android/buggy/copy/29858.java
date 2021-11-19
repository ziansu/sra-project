private void useBoon(java.lang.String spellName) {
    ((com.TigersIter2.managers.Boon) (avatar.getSkills().getSkill(spellName))).activate();
}