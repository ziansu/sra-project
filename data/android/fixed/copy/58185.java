public static edu.nju.treasuryArbitrage.model.LiveData getInstance() {
    if ((edu.nju.treasuryArbitrage.model.LiveData.self) == null) {
        edu.nju.treasuryArbitrage.model.LiveData.self = new edu.nju.treasuryArbitrage.model.LiveData();
    }
    return edu.nju.treasuryArbitrage.model.LiveData.self;
}