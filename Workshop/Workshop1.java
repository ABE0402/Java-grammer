import java.util.Scanner;

public class Workshop1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("중간 점수 입력 :");
        float mid = scanner.nextFloat();
        System.out.print("기말 점수 입력 :");
        float last = scanner.nextFloat();
        System.out.print("레포트 점수 입력 :");
        float report = scanner.nextFloat();
        System.out.print("출석 점수 입력 :");
        float check = scanner.nextFloat();
        
        float result = (mid + last) / 2 * 0.6f + report * 0.2f + check * 0.2f;

        String grade ;
        
        if (result >= 90) {
            grade = "A";
        } else if (result >= 80) {
            grade = "B";
        } else if (result >= 60) {
            grade = "C";
        } else {
            grade= "F";
        }

        System.out.println("중간 점수: " + mid);
        System.out.println("기말 점수: " + last);
        System.out.println("레포트 점수: " + report);
        System.out.println("출석 점수: " + check);
        System.out.println("성적: " + result);

        switch (grade) {
            case "A":
                System.out.println("학점 = A");
                System.out.println("평가 = excellent");
                break;
            case "B":
                System.out.println("학점 = B");
                System.out.println("평가 = excellent");
                break;
            case "C":
                System.out.println("학점 = C");
                System.out.println("평가 = good");
                break;
            case "D":
            	 System.out.println("학점 = D");
                 System.out.println("평가 = good");
            case "F":
                System.out.println("학점 = F");
                break;
            default:
                System.out.println("잘못된 성적 범위");
        }
    }

}
