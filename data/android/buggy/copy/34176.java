@org.junit.Test
public void construct() {
    Location unconstrainedLocation = new Location(10, 20);
    Location constrainedLocation = new Location(3, 4, 0, 8);
}