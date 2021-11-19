public static com.opera.core.systems.runner.launcher.OperaLauncherProtocol.MessageType get(byte code) {
    com.opera.core.systems.runner.launcher.OperaLauncherProtocol.MessageType type = com.opera.core.systems.runner.launcher.OperaLauncherProtocol.MessageType.lookup.get(code);
    return type;
}