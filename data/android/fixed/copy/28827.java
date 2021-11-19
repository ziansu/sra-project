public org.openhab.binding.volkszaehler.internal.Time getFirstTime() {
    if ((listOfTimeOriginal.size()) != 0) {
        return new org.openhab.binding.volkszaehler.internal.Time(listOfTimeOriginal.get(0));
    }else {
        return null;
    }
}