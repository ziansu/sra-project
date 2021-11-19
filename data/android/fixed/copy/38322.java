public static void magicArmor3() {
    Gear.aRat[5] = 18;
    if ((Gear.aRat[5]) > (Gear.mw.soak)) {
        Gear.mw.armorName = "Magic Armor III";
        Gear.mw.soak = 18;
        java.lang.System.out.println("You found Magic Armor III");
    }
}