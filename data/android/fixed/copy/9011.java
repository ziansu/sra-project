@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    gamelogic.Logic l = new gamelogic.Logic();
    graphics.GameFrame f = new graphics.GameFrame(l);
    gamelogic.ClockRunner clock = new gamelogic.ClockRunner(f);
    f.setClock(clock);
}