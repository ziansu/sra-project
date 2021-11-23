@com.google.firebase.database.Exclude
public edu.rose_hulman.humphrjm.finalproject.CustomLatLng getCustomLatLng() {
    return new edu.rose_hulman.humphrjm.finalproject.CustomLatLng(this.getLocation().getLatitude(), this.getLocation().getLongitude(), key, 0, name);
}