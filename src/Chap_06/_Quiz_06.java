package Chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); // 강우성 -> 강**
        //for (int i = index; i < data.length(); i++)
        for(int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }
    public static void main(String[] args) {
        // 개인 정보 중 일부를 비공개로 전환하는 프로그램으 작성하시오

        // 이름
        // 주민번호
        // 전화번호

        // 개인정보룰 비공개로 전환하는 메소드 작성
        // 하나의 메소드에서 모든 동작 처리
        // 각 정보는 아래위치부터 비공개 적용

        String name = "강우성";
        String id = "000208-3075824";
        String phone = "010-4999-3289";

        System.out.println(getHiddenData(name, 1));
        System.out.println(getHiddenData(id, 8));
        System.out.println(getHiddenData(phone, 9));

    }

}
