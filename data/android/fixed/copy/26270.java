public final synchronized org.optimizationBenchmarking.utils.graphics.style.color.ColorStyle allocateColor() {
    final int index;
    index = this.m_usedColors;
    this.m_usedColors = (index + 1) % (this.m_def.m_colorsSize);
    return this.m_def.m_colors.get(index);
}