public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.tale.init.TaleLoader.init();
    com.tale.init.TaleLoader.loadPlugin(new java.io.File("/Users/biezhi/workspace/projects/java/plugin_upyun/target/plguin_upyun.jar"));
    com.blade.Blade.$().start(com.tale.Application.class);
}