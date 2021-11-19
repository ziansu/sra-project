@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void scaleArmorTooHighTechLevelTest() {
    new Equipment.Armor.ScaleArmor(5);
}