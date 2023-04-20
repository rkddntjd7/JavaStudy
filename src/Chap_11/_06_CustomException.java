package Chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외
        int age = 17; // 만 17세
        try {
            if (age < 19) {
                // System.out.println("19세 미만에게 판매하지 않습니다.");
                throw new AgeLessThan19Exception("19세 미만에게 판매하지 않습니다.");
            } else {
                System.out.println("주문하신 상품 여기용");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("좀 더 성장하고 오세요.");
        } catch (Exception e){
            System.out.println("모든 예외 처리");
        }
    }
}

class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
