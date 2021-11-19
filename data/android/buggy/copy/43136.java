@java.lang.Override
public void run(java.lang.Integer code, java.lang.String errorMessage) {
    java.lang.System.out.println(java.lang.String.format("Player update:: error %d (%s)", code, errorMessage));
    finish.run(null);
}