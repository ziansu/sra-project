public void renderScan() {
    int control = cpu.memory.readByte(GPU.LCD_CONTR_REG);
    renderTiles();
    if (cpu.bitTest(control, 1))
        renderSprites();
    
}