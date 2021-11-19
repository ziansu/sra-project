public boolean isKeyPressedRaw(int keycode) {
    return this.charCallback.isEnabled() ? false : (org.lwjgl.glfw.GLFW.glfwGetKey(this.windowID, keycode)) == (org.lwjgl.glfw.GLFW.GLFW_PRESS);
}