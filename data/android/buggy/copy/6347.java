public static yaplstack.Instruction popCallFrame(int pushCount) {
    return ( thread) -> {
        thread.callFrame.outer.pushTo(thread.callFrame, pushCount);
        thread.callFrame = thread.callFrame.outer;
        thread.callFrame.incrementIP();
    };
}