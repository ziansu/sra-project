public void enter() {
    active = true;
    cui.enter();
    Root.INSTANCE.renderSystem.addObject(background, 3);
    Root.INSTANCE.input.addProcessor(input);
}