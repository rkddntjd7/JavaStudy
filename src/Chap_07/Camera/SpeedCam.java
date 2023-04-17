package Chap_07.Camera;

// Speed is a Camera (IS-A)
public class SpeedCam extends Camera{ // 자식클래스


    public SpeedCam() {
        super("과속단속 카메라");
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }



    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("차량번호를 인식합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도측정, 번호 인식");
    }
}
