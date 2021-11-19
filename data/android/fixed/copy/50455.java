@java.lang.Override
public void setKarmaChance(int chance) throws java.lang.IllegalArgumentException {
    if (chance > 0) {
        this.chance = chance;
    }else {
        throw new java.lang.IllegalArgumentException("The karma chance must be greater than 0");
    }
}