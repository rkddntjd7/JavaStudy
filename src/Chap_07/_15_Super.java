package Chap_07;

import Chap_07.Camera.Camera;
import Chap_07.Camera.FactoryCam;
import Chap_07.Camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("----------------");

        speedCam.takePicture();

    }
}
