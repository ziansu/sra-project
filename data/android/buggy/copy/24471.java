private static void exitProgram() {
    com.lost.blocks.ModelView.ModelWindow.cleanup();
    LostBlocks.queue.add(new java.lang.Runnable() {
        public void run() {
            java.lang.System.exit(0);
        }
    });
}