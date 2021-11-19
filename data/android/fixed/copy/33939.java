public void pop() {
    cur = stack.pop();
    driver.manage().timeouts().implicitlyWait(cur, java.util.concurrent.TimeUnit.SECONDS);
}