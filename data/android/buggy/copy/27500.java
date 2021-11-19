@java.lang.Override
public boolean visit(models.entities.Monster monster) {
    if ((this.checkItem()) && (monster.canTraverse())) {
        this.insertEntity(monster);
        return true;
    }
    return monster.canSwim();
}