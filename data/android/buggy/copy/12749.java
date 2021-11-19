public void slideshowSpeedChanged(int newSpeed) {
    android.widget.Toast.makeText(this, ("speed = " + newSpeed), Toast.LENGTH_SHORT).show();
    asbridge.me.uk.MPhoto.helper.Utils.setSlideshowDelay(this, newSpeed);
}