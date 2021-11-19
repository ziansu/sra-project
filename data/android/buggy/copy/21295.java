public void repair() {
    java.lang.System.out.println(("Starting to repair " + (shipCompElem.getId())));
    stellarclicker.util.EShipComponent shipEnum = stringToEnum(shipCompElem.getId());
    MainApplication.app.myShip.gainComponentRepair(shipEnum);
    disableLevelButton();
}