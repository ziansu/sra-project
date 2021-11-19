public void setArmors(java.util.List<objects.Armor> armors) {
    this.armors = armors;
    for (objects.Armor a : this.armors) {
        ultima.Constants.ArmorType t = a.getType();
        t.setArmor(a);
    }
}