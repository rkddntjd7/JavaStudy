package Chap_04;

public class _11_Continue {

    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번  손님이 노쇼
        for(int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨나왔습니더.");

            // 손님이 없다면 noShow
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 갑니다.");
                continue;
            }

            sold++; // 판매처리
            if(sold == max) {
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("영업 종료");

        System.out.println("----------------");

        // While 문
        sold = 0;
        int index = 1; // 손님번호
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니디.");

            // noShow 고객
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 갑니다.");
                index++;
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료 소진");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");


    }

}
