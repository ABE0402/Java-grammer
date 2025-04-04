import java.util.Scanner;

public class DaysofMonthTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("연도 :");
        int year = scanner.nextInt();
        System.out.println("달 :");
        int month = scanner.nextInt(); 
        

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            switch(month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(year + "년 " + month + "월은 총 31일까지 존재합니다.");
                    break; 
                case 2:
                    System.out.println(year + "년 " + month + "월은 총 29일까지 존재합니다."); // Leap year February
                    break;
                case 4, 6, 9, 11:
                    System.out.println(year + "년 " + month + "월은 총 30일까지 존재합니다.");
                    break;
                default:
                    System.out.println("잘못된 달 입력입니다.");
                    break;
            }
        } else {
            switch(month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(year + "년 " + month + "월은 총 31일까지 존재합니다.");
                    break;
                case 2:
                    System.out.println(year + "년 " + month + "월은 총 28일까지 존재합니다.");
                    break;
                case 4, 6, 9, 11:
                    System.out.println(year + "년 " + month + "월은 총 30일까지 존재합니다.");
                    break;
                default:
                    System.out.println("잘못된 달 입력입니다.");
                    break;
            }
        }
        scanner.close();  
    }
}
