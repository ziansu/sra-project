public static com.andrejjj.criminalintent.models.CrimeLab get(android.content.Context context) {
    if ((com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab) == null) {
        com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab = new com.andrejjj.criminalintent.models.CrimeLab(context);
    }
    return com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab;
}