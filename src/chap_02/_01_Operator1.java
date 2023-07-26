package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        // 일반 연산 기본
        System.out.println(5/2); //2 5/2의 몫이 나옴
        System.out.println(4%2); // 4를 2로 나눈 나머지 2
        System.out.println(5%2); // 5를 2로 나눈 나머지

        // 증감 연산 ++.--
        // ++val과 val++의 차이!!

        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11 -> ++을 먼저 시행(10+1)한 후 sout 실행
        System.out.println(val); //11

        val=10;
        System.out.println(val); //10
        System.out.println(++val); //10 sout을 먼저 실행한 후(val=10이먼저 뽑히고 난 후)++
        System.out.println(val); //11 ++ 된 값

        //--val, val-- 도 마찬가지

        // 은행 대기 번호 표 예시로 쉽게 이해하기
        int wating = 0;
        System.out.println("대기 인원 : "+ wating++); // 대기 인원 : 0
        System.out.println("대기 인원 : "+ wating++); // 대기 인원 : 1
        System.out.println("대기 인원 : "+ wating++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : "+wating); // 총 대기 인원 : 3


    }
}
