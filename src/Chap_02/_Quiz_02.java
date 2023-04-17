package Chap_02;

public class _Quiz_02 {

    public static void main(String[] args) {
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램으 작성하시오.
        // - 키가 120cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용

        int tall1 = 115;
        int tall2 = 121;

        System.out.println((tall1 >= 120)? "키가 121cm 이므로 탑승가능합니다" : "키가 120cm 미만이기 때문에 탑승 불가입니다.");
        System.out.println((tall2 >= 120)? "키가 121cm 이므로 탑승가능합니다" : "키가 120cm 미만이기 때문에 탑승 불가입니다.");

        int height = 115;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다.";
        System.out.println("키가 " + height + "cm 이므로 " + result);

        int height2 = 121;
        String result2 = (height2 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다.";
        System.out.println("키가 " + height2 + "cm 이므로 " + result2);

    }

}
