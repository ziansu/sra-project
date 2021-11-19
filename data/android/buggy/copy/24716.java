public void setSpecialAbility(java.lang.String specialAbility) {
    if (specialAbility.equals(game.resources.SpecialAbility.values())) {
        this.specialAbility = specialAbility;
    }else {
        this.specialAbility = "None";
    }
}