package tests.DAY_2;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppYukleme {
    AndroidDriver<AndroidElement> driver;

    @Test
    public void upload() throws MalformedURLException {
        // kullanici gerekli kurulumlari yapar
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2"); // Eger ki kullandigimiz android surumu 6 veya ustuyse UiAutomator2 kullanilir
        // Eger ki kullandigimiz android surumu 6 veya ustuyse UiAutomator2 kullanilir
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahmet\\IdeaProjects\\APPIUM_T-113\\Apps\\Apk Bilgisi_2.3.4_apkcombo.com.apk");
        // app capabilityType bir uygulamayi yuklemek istedigimizde indirdigimiz apk dosyasinin path uzantisini vererek o uygulamayi yuklemek icin kullandigimiz desiredCapability
        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
