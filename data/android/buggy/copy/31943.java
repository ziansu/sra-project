private void checkCollisions(org.academiadecodigo.codewar.Projectile[] mcProjectiles, org.academiadecodigo.codewar.Projectile[] playerProjectiles, org.academiadecodigo.codewar.Char[] chars) {
    org.academiadecodigo.codewar.CollisionChecker.check(mcProjectiles, chars);
    org.academiadecodigo.codewar.CollisionChecker.check(playerProjectiles, chars);
}