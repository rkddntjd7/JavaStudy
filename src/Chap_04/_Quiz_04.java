package Chap_04;

public class _Quiz_04 {

    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.

        // 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인차량은 50% 할인

        // ex) 일반 차량 5시간 주차 시 20000원
        // 경차 5시간 주차 시 10000원
        // 장애인 차량 10시간 주차 시 15000원

        int hour = 10; // 주차 시간
        boolean smallCar = false; // 경차여부
        boolean disablePerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 시간당 4000원

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000; // 일일 최대 요금 적용
        }

        // 50% 할인

        if(smallCar || disablePerson) {
            fee = fee / 2; // 할인 금액 적용
        }

        // 실행결과 출력
        System.out.println("주차요금은 " + fee + " 원 입니다.");
    }

}
