@java.lang.Override
public boolean reportFixture(simulator.Fixture fixture) {
    if (fixture.testPoint(middle)) {
        occupancyMatrix[(icopy + 10)][(jcopy + 10)] = 1;
    }
    return true;
}