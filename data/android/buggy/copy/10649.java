public com.maksym.galushka.criminalintent.Crime getCrime(java.util.UUID uuid) {
    for (com.maksym.galushka.criminalintent.Crime crime : mCrimes) {
        if ((crime.getId()) == uuid)
            return crime;
        
    }
    return null;
}