import java.util.Scanner;

class Mp3FileFindUtil{
	String[] getMp3FileNameList(String originalString) {
		String[] fileNameArray = originalString.split(",");
		
		//검색된 mp3 파일 개수 크기로 배열객체를 생성해서 반환
		int count = 0;
		for (int i = 0; i < fileNameArray.length; i++) {
			String[] file = fileNameArray[i].split("\\.");
			if(file[1].equals("mp3")) {
				count++;
			}
		}
		String[] mp3FileNameArray = new String[count];
		int index = 0;
		for (int i = 0; i < fileNameArray.length; i++) {
			String[] file = fileNameArray[i].split("\\.");
			if(file[1].equals("mp3")) {
				mp3FileNameArray[index++]=fileNameArray[i];
			}
		}
		return mp3FileNameArray;
	}
	
}
public class MP3FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일 목록 문자열: ");
		String fileNameList =sc.next();
		Mp3FileFindUtil Find = new Mp3FileFindUtil();
		
		String[] mp3FileList = Find.getMp3FileNameList(fileNameList);
        System.out.println("검색된 mp3 파일 목록");
        for(String mp3FileName : mp3FileList) {
        	System.out.println(mp3FileName);
        }

	}

}
