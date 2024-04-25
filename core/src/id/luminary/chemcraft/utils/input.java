package id.luminary.chemcraft.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import id.luminary.chemcraft.state.Device;

import static sun.jvm.hotspot.debugger.win32.coff.DebugVC50X86RegisterEnums.TAG;

public class input {
    public static void SetDeviceType() {
        switch (Gdx.app.getType()) {
            case Android:
                Device.setMobile(true);
                Device.setDevice(Device.Devices.TOUCH);
            case Desktop:
                Device.setDevice(Device.Devices.KEYBOARD);
                Device.setMobile(false);
        }
    }

    public static void CheckAvailableDevice() {
        Device.setKeyboardAvailable(Gdx.input.isPeripheralAvailable(Input.Peripheral.HardwareKeyboard));
        int therecontroller = 0;
        for(Controller controller : Controllers.getControllers()) {
            Gdx.app.log(String.valueOf(TAG), controller.getName());
            therecontroller++;
        }
        Device.setControllerAvailable(therecontroller > 0);
    }
}
