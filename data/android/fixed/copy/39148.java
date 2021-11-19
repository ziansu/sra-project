public static boolean isBluPlugActive() {
    return com.grarak.kerneladiutor.utils.Utils.readFile(com.grarak.kerneladiutor.utils.kernel.HOTPLUG_BLU_PLUG_ENABLE).equals("1");
}