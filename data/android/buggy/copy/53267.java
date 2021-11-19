public static Engine.BulletHitChecker getInstance() {
    if ((Engine.BulletHitChecker.good2go) == false) {
        Engine.BulletHitChecker.instance = new Engine.BulletHitChecker();
    }
    return Engine.BulletHitChecker.instance;
}