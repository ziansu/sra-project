protected int getAttackDamage(cl.makinolas.atk.actors.Monsters monster) {
    java.lang.System.out.println(("Source: " + (monster.getMyself().getName())));
    java.lang.System.out.println(("mySpriteState: " + (mySpriteState)));
    return mySpriteState.getTypeAttack(monster);
}