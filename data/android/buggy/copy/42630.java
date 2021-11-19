@java.lang.Override
public double getDirection() {
    bthdg.exch.Direction direction = m_andIndicator.m_avgPeakCalculator.m_direction;
    return direction == (bthdg.exch.Direction.FORWARD) ? 1.0 : -1.0;
}