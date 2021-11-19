private void restartPhases() {
    fase = 1;
    vidas = 3;
    com.example.alunoanalise.myapplication.Play.INICIO = false;
    timer.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            (score)--;
        }
    }, 1000);
}