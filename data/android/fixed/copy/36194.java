public static long calculateProficiency(long level, long abilityModifier, boolean isProficient) {
    long result = abilityModifier;
    if (isProficient) {
        long proficiency = edu.auburn.eng.csse.comp3710.bch0011.bagofholding.Utilities.Utilities.getProficiencyBonus(level);
        result += proficiency;
    }
    return result;
}