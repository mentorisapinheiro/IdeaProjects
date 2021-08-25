package driverFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    AppiumDriver<MobileElement> driver;

    public DesiredCapabilities configEmulator(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "android-emulator-live");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.utpalchoudhary.mytestapplication");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.utpalchoudhary.mytestapplication.MainActivity");



        return capabilities;

    }

    public void iniciarDriver(){
        try{
            System.out.println("Estou aqui!");
          this.driver = new AppiumDriver<>(new URL("http:127.0.0.1:58221/wd/hub"), configEmulator());
        }catch (MalformedURLException exception)
        {
         System.out.println("url inválida"+ exception.getMessage());

        }

    }
     public AppiumDriver<MobileElement> pegaDriver(){
         try{
             System.out.println("Estou aqui!");
             this.driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), configEmulator());
         }catch (MalformedURLException exception)
         {
             System.out.println("url inválida"+ exception.getMessage());

         }
      return this.driver;
   }

}