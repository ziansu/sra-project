public void setSeasonName(java.lang.String seasonName) {
    mSeasonName = (seasonName != "pt-br") ? seasonName : ((mSeasonNumber) + "ª ") + "Temporada";
}