public void testFindHotelsByEmptyCity() {
    com.javaworld.hotels.model.HotelModel finder = new com.javaworld.hotels.model.HotelModel();
    java.util.List<com.javaworld.hotels.businessobjects.Hotel> hotels = finder.findHotelsByCity("");
    assertTrue(((hotels.size()) == 0));
}