@org.junit.Before
public void setUp() {
    nullAttribute = new datastructures.Attribute();
    namedAttribute = new datastructures.Attribute("Name");
    characterlessAttribute = new datastructures.Attribute("");
    namedAttr = "Atributo";
    stringAttr = new datastructures.Attribute(namedAttr);
}