public void onCompleted() {
    java.lang.System.out.println(("Exiting last sum was : " + (this.sum)));
    this.latch.countDown();
}