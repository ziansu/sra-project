@org.junit.Test
public void shouldMapNestedBeans() {
    LandMapper.INSTANCE.landToDto(new org.mapstruct.ap.test.nestedbeans.unmappable.Land(new org.mapstruct.ap.test.nestedbeans.unmappable.House("Good", 1998, new org.mapstruct.ap.test.nestedbeans.unmappable.Roof(1))));
}