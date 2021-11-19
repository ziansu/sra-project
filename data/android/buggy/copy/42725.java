private void improvedMindBlast(int pointsSpent) {
    se.wowsim.spells.types.Spell affectedSpell = spells.get("Mind Blast");
    reduceCooldown(affectedSpell, (pointsSpent * 5));
}