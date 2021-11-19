public void addOnChangedListener(org.hsrw.artandcycle.util.GPSManager.OnChangedListener listener) {
    if (!(this.mListener.contains(listener))) {
        this.mListener.add(listener);
    }
}