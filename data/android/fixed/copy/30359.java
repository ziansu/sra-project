@com.squareup.otto.Subscribe
public void subscribe(today.gacha.android.services.GachaLocationService.LastLocationEvent event) {
    assertFalse(event.isSuccess());
    assertNull(event.getData());
    latch.countDown();
}