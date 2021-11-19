public static java.awt.Point moveCat1Move(java.awt.Point cat, java.awt.Point target) {
    double angle = CatAndMouse.angleTwoPoints(cat, target);
    CatAndMouse.Direction catDirection = CatAndMouse.convertAngleToDirection(angle);
    cat = CatAndMouse.translatePointWithDirection(cat, catDirection);
    return cat;
}