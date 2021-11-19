public boolean isKeyPressedRaw(int keycode) {
    return (org.lwjgl.glfw.GLFW.glfwGetKey(this.windowID, keycode)) == (org.lwjgl.glfw.GLFW.GLFW_PRESS);
}