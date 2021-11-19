public void finalize() {
    com.week2.solution.ticker.Ticker.getInstance().print(((name) + " is insolvent"));
    insolvent = true;
}