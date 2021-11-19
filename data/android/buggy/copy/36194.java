public static java.lang.Integer calculateProficiency(java.lang.Integer level, java.lang.Integer abilityModifier, boolean isProficient) {
    java.lang.Integer result = abilityModifier;
    if (isProficient) {
        java.lang.Integer proficiency = edu.auburn.eng.csse.comp3710.bch0011.bagofholding.Utilities.Utilities.getProficiencyBonus(level);
        result += proficiency;
    }
    return result;
}