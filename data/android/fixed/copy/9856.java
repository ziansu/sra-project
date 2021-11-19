public void push(int seconds) {
    stack.push(cur);
    cur = seconds;
    driver.manage().timeouts().implicitlyWait(cur, java.util.concurrent.TimeUnit.SECONDS);
}