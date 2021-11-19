private long waitForNextFrame(long frame_start_time) {
    long next_frame_start_time = input.timeNow();
    long how_long_we_took = next_frame_start_time - frame_start_time;
    long wait_time = (rabbitescape.render.gameloop.GameLoop.frame_time_ms) - how_long_we_took;
    input.waitMs(wait_time);
    return next_frame_start_time;
}