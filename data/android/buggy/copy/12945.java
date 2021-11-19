@java.lang.Override
public boolean remove() {
    this.body.destroyFixture(fixture);
    return super.remove();
}