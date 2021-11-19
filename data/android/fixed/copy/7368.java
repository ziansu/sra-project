public static void addWindow(com.stardust.enhancedfloaty.FloatyWindow window) {
    if ((com.stardust.enhancedfloaty.FloatyService.windows.add(window)) && ((com.stardust.enhancedfloaty.FloatyService.instance) != null)) {
        window.onCreate(com.stardust.enhancedfloaty.FloatyService.instance, com.stardust.enhancedfloaty.FloatyService.instance.mWindowManager);
    }
}