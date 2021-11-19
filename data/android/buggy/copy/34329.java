private void updateAlphaClick(int dy) {
    dy = net.minecraft.util.MathHelper.clamp_int(0, dy, 64);
    dy = 64 - dy;
    alpha = (dy * 255) / 64;
}