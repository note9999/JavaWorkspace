package chap_01;

public class _05_Constants {
    public static void main(String[] args) {
        // 상수는 값이 한 번 정의되면 바꿀 수 없는 것, 모든 글자를 대문자로 적어줌
        // 상수 예시

        final String KR_COUNTRY_CODE = "82+"; // 국가번호
        // KR_COUNTRY_CODE = "+8282"; // 상수선언 전에는 이것이 가능하지만 상수 선언 후(final) 는 불가능
        System.out.println(KR_COUNTRY_CODE);


    }
}
