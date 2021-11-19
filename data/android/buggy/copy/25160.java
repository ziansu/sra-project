@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void scaleArmorTooLowTechLevelTest() {
    Equipment.Armor.ScaleArmor scaleArmor = new Equipment.Armor.ScaleArmor(1);
}