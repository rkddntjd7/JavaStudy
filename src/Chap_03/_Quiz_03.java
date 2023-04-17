package Chap_03;

public class _Quiz_03 {

    public static void main(String[] args) {
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오.
        // - 주민등록번호는 13자리의 숫자로 구성
        // 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫번째 숫자는 성별 정보
        // 입력 데이터는 - 을 포함한 14자리의 문자열 형태
        // ex) "901231-1234567" 인 경우 901231-1 까지 출력
        // ex) "030708-4567890" 인 경우 030708-4 까지 출력

        String a = "901231-1234567";
        String b = "030708-4567890";

        System.out.println(a.substring(a.indexOf("9"), (a.lastIndexOf("2"))));
        System.out.println(b.substring(b.indexOf("0"), (b.indexOf("5"))));

        System.out.println(a.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(a.substring(0, a.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2

    }

}
