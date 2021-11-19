@org.junit.Test
public void testHashCodeSame() {
    nl.tudelft.pixelperfect.event.EventParameter other = new nl.tudelft.pixelperfect.event.EventParameter("test", EventParameterValues.HOSTILE_SHIP_ARMOR_ENERGY_SHIELD);
    org.junit.Assert.assertThat(object.hashCode(), org.hamcrest.CoreMatchers.equalTo(other.hashCode()));
}