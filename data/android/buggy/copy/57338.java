public void CheckEat() {
    java.lang.System.out.println("CheckEat Initiate");
    if (eat()) {
        snake_x[snake_length] = tail_buffer_X;
        snake_y[snake_length] = tail_buffer_Y;
        (snake_length)++;
    }
}