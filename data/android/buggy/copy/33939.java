public void pop() {
    stack.pop();
    cur = stack.peek();
    driver.manage().timeouts().implicitlyWait(cur, java.util.concurrent.TimeUnit.SECONDS);
}