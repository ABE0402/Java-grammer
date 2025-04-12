//. : 정규식에서 임의의 한문자 의미
// \.이 마침표 .을 의미
// \자체를 문자열로 출력하려면 \\로 해야한다.
import java.util.Scanner;

class FileNameSplitUtil {

	//2. 교수님 방식
	public String[] splitFileName1(String originalFileName) {
		return originalFileName.split("\\.");
	}
	
	//1. 내 방식
    public void splitFileName(String originalFileName) {
    	
    	 String[] splitStr = originalFileName.split("\\.");

         for (String str : splitStr) {
             System.out.println(str);
         }
             String name = String.join(".", java.util.Arrays.copyOf(splitStr, splitStr.length - 1));
             String extension = splitStr[splitStr.length - 1];

             System.out.println("파일 이름: " + name);
             System.out.println("확장자: " + extension);
         
     
    }
}


public class FileNameSplitMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름 : ");
        String fileName = sc.nextLine();

        FileNameSplitUtil split = new FileNameSplitUtil();
        //2. 교수님 방식
        String[] splitFileNameArray = split.splitFileName1(fileName);
        System.out.println("파일 이름: " + splitFileNameArray[0]);
        System.out.println("확장자: " + splitFileNameArray[1]);
        
        //1. 내 방식
        split.splitFileName1(fileName);
    }
}

