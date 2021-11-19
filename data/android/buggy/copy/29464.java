public uk.co.qmunity.lib.helper.BlockPos add(int x, int y, int z) {
    this.x += x;
    this.y += y;
    this.z += z;
    return new uk.co.qmunity.lib.helper.BlockPos(x, y, z);
}