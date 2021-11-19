private void updateAlphaClick(int dy) {
    dy = net.minecraft.util.MathHelper.clamp_int(dy, 0, 64);
    dy = 64 - dy;
    alpha = (dy * 255) / 64;
}