package Chap_05;

public class _02_ArrayLoop {

    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees =  {"아메리카노", "카푸치노", "라때", "카푸치노"};

        // for 반복문 순회
        for(int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------------");

        // 배열의 길이를 이용한 순회
        for(int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");

        System.out.println("------------------");

        // enhanced foe (for-each) 반복문
        for (String coffee : coffees) { // coffees 의 배열 하나하나를  coffee 라는 변수를 만들어 값에 하나씩 넣는다
            System.out.println(coffee + "하나");
        }
        System.out.println("줏세요");
    }

}
