public Piece dequeue() {
    Piece rarestPiece = null;
    try {
        rarestPiece = queue.take();
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println(e);
        e.printStackTrace();
    }
    return rarestPiece;
}