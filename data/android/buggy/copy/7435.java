@com.squareup.otto.Subscribe
public void subscribe(today.gacha.android.services.GachaLocationService.CurrentLocationEvent event) {
    assertTrue(event.isSuccess());
    assertNotNull(event.getLocation());
    latch.countDown();
}