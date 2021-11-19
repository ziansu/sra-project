public static void kickoffDeleteRun(final java.lang.Long run_id) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            master.AbstractMaster.singleton.deleteRun(run_id);
        }
    }).start();
}