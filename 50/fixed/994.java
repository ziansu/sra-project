public static boolean registerButton(com.kylantraynor.civilizations.menus.Button bt) {
    if (com.kylantraynor.civilizations.menus.ButtonManager.buttons.contains(bt)) {
        return false;
    }else {
        com.kylantraynor.civilizations.menus.ButtonManager.buttons.add(bt);
        return true;
    }
}