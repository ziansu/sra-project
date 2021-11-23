public static yaplstack.Instruction popCallFrame(int pushCount) {
    return ( thread) -> {
        thread.callFrame.pushTo(thread.callFrame.outer, pushCount);
        thread.callFrame = thread.callFrame.outer;
        thread.callFrame.incrementIP();
    };
}