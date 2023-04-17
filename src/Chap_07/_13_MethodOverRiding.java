package Chap_07;

import Chap_07.Camera.Camera;
import Chap_07.Camera.FactoryCam;
import Chap_07.Camera.SpeedCam;

public class _13_MethodOverRiding {

    public static void main(String[] args) {
        // 메소드오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
        Camera camera = new Camera();

        FactoryCam factoryCam = new FactoryCam();

        SpeedCam speedCam = new SpeedCam();



        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }

}
