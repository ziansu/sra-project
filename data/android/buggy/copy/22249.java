private void go() {
    if (getMoney()) {
        showGetMoneyLog();
    }else {
        showErrorGetMoneyLog();
    }
    try {
        join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}