public void testGetInstance() {
    java.lang.System.out.println("Testing SodaBottleFiller::getInstance");
    edu.jalc.inclass.cocacola.manufacturing.SodaBottleFiller sodaBottleFiller = edu.jalc.inclass.cocacola.manufacturing.SodaBottleFiller.getInstance();
    assert sodaBottleFiller == (sodaBottleFiller.getInstance());
}