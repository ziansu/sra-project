public void onCompleted() {
    java.lang.System.out.println(("Exiting last sum was : " + (this.get())));
    this.latch.countDown();
}