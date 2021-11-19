public void SetSea() {
    if ((!(Walkable())) && (SeaOrLake())) {
        throw new java.lang.IllegalStateException("!Walkable() && SeaOrLake()");
    }
    m_altitude = 0;
}