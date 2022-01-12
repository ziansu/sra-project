private void registerModules() {
    mitb.TitanBot.MODULES.add(new mitb.module.modules.TestCommandModule());
    mitb.TitanBot.MODULES.add(new mitb.module.modules.LastSeenModule());
    mitb.TitanBot.LOGGER.info("Registered all modules.");
}