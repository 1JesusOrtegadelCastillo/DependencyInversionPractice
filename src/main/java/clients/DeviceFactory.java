package clients;

import processes.LaptopManufacturing;
import processes.ManufactoringProcess;
import processes.SmartphoneManufacturing;

public class DeviceFactory {
    public static void main(String[] args){
        ManufactoringProcess manufacturer = new SmartphoneManufacturing("Iphone 14");
        manufacturer.launchProcess();
    }
}
