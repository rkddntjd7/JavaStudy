package Chap_01;

public class _03_Variables {

    public static void main(String[] args) {
        // 변수
        String name = "강우성"; // 문자형
        int hour = 15; // 정수형

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // 한 글자 표현할때 작은 따옴표
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점음 " + grade + "입니다.");

        boolean pass = true; // 참과 거짓
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.1412345556;
        float f = 3.1412345553f; // double 보다 정밀하지 못하다 , 뒤에 f 붙여야함
        System.out.println(d);
        System.out.println(f);


        long l = 1000000000000l;
        l = 1_000_000_000_000l;// int 보다 큰 값 가능 뒤에 l 붙여야함
        System.out.println(l);
    }

}
