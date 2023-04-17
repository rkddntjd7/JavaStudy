package Chap_01;

public class _Quiz_01 {

    public static void main(String[] args) {
        // 버스 도착 정보를 출력하는 프로그램을 작성하시오.
        // 각 정보는 적절한 자료형의 변수에 정의합니다.

		/*버스 번호는 "1234", "상암08" 과 같은 형태
		남은 시간은 분 단위(예: 3분, 5분)
		남은 거리는 km 단위(예: 1.5kx, 0.8km)*/

        String busNumber = "상암08번";
        int min = 3;
        double km = 1.2;

        System.out.println(busNumber + "번 버스 약 " + min + "분 후 도착 남은 거리 " + km + "km" );

    }

}
