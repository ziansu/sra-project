@org.junit.Before
public void setUp() {
    this.testBubble = new org.group17.Units.Bubble(new org.group17.Math.Vector(0, 0), testMap, new org.group17.Math.Vector(0.0, 0.0));
    this.testMap.add(this.testBubble);
}