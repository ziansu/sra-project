public void InvaderIsHitByProjectile(actors.InvaderShip invader, actors.HeroProjectile heroProjectile) {
    eventResolution.Push(new collision.ExplodeInvaderShip(invader));
    eventResolution.Push(new collision.AbsorbProjectile(heroProjectile));
}