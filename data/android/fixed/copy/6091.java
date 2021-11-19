public static void ironArmor() {
    Gear.aRat[0] = 6;
    if ((Gear.aRat[0]) > (Gear.mw.soak)) {
        Gear.mw.armorName = "Iron Armor";
        Gear.mw.soak = 6;
        java.lang.System.out.println("You found Iron Armor");
    }
}