public boolean isAvailableIn(int year, boolean clan) {
    return ((getIntroductionDate(clan)) >= year) && (!(techAdvancement.isExtinct(year, clan)));
}