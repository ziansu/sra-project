public void swapAndShiftDownAll() {
    if (canShiftDownAny()) {
        java.lang.System.err.println("Es muss erst alles was geht sinkengelassen werden");
    }
    while ((swapIndex) > 1) {
        this.singleSwapAndShiftDown();
        this.printHeap();
    } 
}