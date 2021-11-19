@java.lang.Override
public void setup() {
    smooth();
    DAI.get_params();
    size(DAI.display_width, DAI.display_height);
}