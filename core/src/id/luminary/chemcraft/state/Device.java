package id.luminary.chemcraft.state;

public class Device {

    public enum Devices {
        KEYBOARD, TOUCH, CONTROLLER,NOTHING
    }
    private static Devices device = Devices.NOTHING;
    private static boolean isMobile;
    private static boolean KeyboardAvailable;
    private static boolean TouchAvailable;
    private static boolean ControllerAvailable;

    public static Devices getDevice() {
        return device;
    }

    public static void setDevice(Devices device) {
        Device.device = device;
    }

    public static boolean isControllerAvailable() {
        return ControllerAvailable;
    }

    public static boolean isKeyboardAvailable() {
        return KeyboardAvailable;
    }

    public static boolean isMobile() {
        return isMobile;
    }

    public static boolean isTouchAvailable() {
        return TouchAvailable;
    }

    public static void setControllerAvailable(boolean controllerAvailable) {
        ControllerAvailable = controllerAvailable;
    }

    public static void setKeyboardAvailable(boolean keyboardAvailable) {
        KeyboardAvailable = keyboardAvailable;
    }

    public static void setMobile(boolean mobile) {
        isMobile = mobile;
    }


    public static void setTouchAvailable(boolean touchAvailable) {
        TouchAvailable = touchAvailable;
    }
}
