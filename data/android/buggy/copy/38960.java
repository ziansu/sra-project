public void rotateCounterClockwise() {
    setRotation(com.example.crunky.smartminifab.Block.blockRotationValues[(((m_rotation.ordinal()) - 1) % (com.example.crunky.smartminifab.Block.blockRotationValues.length))]);
}