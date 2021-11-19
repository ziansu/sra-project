public java.util.ArrayList<application.models.playerAsset.Unit> getUnits() {
    java.util.ArrayList<application.models.playerAsset.Unit> newList = battleGroup;
    newList.addAll(reinforcements);
    return newList;
}