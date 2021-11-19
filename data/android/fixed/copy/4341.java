public static com.z299studio.pb.Application getInstance(android.app.Activity context) {
    if ((com.z299studio.pb.Application.__instance) == null) {
        com.z299studio.pb.Application.__instance = new com.z299studio.pb.Application(context);
    }
    return com.z299studio.pb.Application.__instance;
}