package chap_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "note9999";
        int hour = 15;

        System.out.println(name+"님, 배송이 시작됩니다. "+hour +"시에 방문 예정입니다.");
        System.out.println(name+"님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name="강백호"; //note99에서 강백호로 바뀜
        System.out.println(name+"님의 평균 점수는"+score+"점 입니다.");
        System.out.println("학점은"+grade+"입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; // 3.14 넣기위해 f,F 넣어줘야함
        System.out.println(d);
        System.out.println(f);
        System.out.println(f);;

        // int = 100000000000000000000000000;  값이 21억보다 커서 안됨
        long l = 1000000000L;
        l = 1_000_000_000l;

        // int, long, flat ,double , char ,String, boolean 자료형

        // 한 줄 주석 단축키 컨트롤 /
      //  */*/ 여러줄 단축키  컨트롤 쉬프트 /
    }
}
