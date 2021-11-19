public boolean isFull() {
    if ((this.nb_person_in) >= (this.capacity)) {
        android.util.Log.i("Elevator", ((this.id) + " is full"));
        return true;
    }else
        return false;
    
}