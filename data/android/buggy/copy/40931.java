@java.lang.Override
public void adjustmentValueChanged(java.awt.event.AdjustmentEvent e) {
    e.getAdjustable().setValue(e.getAdjustable().getMaximum());
}