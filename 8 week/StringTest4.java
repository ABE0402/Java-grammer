
public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source1 = "aaabbbcccdddeeefffaaabbbcccdddeeefff";
		String source2 = "AAAbbbcccdddeeefffaaabbbcccdddeeefff";

		//char charAt(int index)
		//인자값으로 지정된 인덱스 위치의 문자 하나를 반환
		System.out.println("원본문자열 : " + source1);
		System.out.println("첫번째 문자 : source1.charAt(0)" + source1.charAt(0));
		System.out.println("네번째 문자 : source1.charAt(3)" + source1.charAt(3));

		//int indexOf(String searchStr)
		//인자로 지정된 문자열을 앞에서부터 검색해서 해당 문자열의 시작 인덱스 번호 찾
		System.out.println("aaa 문자열의 시작 인덱스 번호 : source1.indexOf(\"aaa\") : " 
				+ source1.indexOf("aaa"));

		//int lastindexOf(String searchStr)
		//인자로 지정된 문자열을 뒤에서부터 검색해서 해당 문자열의 시작 인덱스 번호 찾
		System.out.println("aaa 문자열의 뒤에서부터 검색한 시작 인덱스 번호 : source1.lastindexOf(\"aaa\") : " 
				+ source1.lastIndexOf("aaa"));

		//String substring(int startIndex)
		//startIndex 문자부터 마지막 문자까지 추출
		System.out.println("네번째 문자부터 마지막 문자까지 추출 : source1.substring(3) : " +source1.substring(3));

		//String substring(int startIndex, int endIndex)
		//startIndex 문자부터 endIndex - 1 문자까지 추출
		System.out.println("네번째 문자부터 여섯번째 문자까지 추출 : source1.substring(3,6) : " +source1.substring(3,6));
		
		//String replace(String oldStr, String newStr)
		//원본문자열에서 oldStr을 newStr로 변경
		System.out.println("원본문자열에서 aaa 문자열을 ggg 문자열로 변경 : source1.replace(\"aaa\",\"ggg\")" + source1.replace("aaa", "ggg"));
		
		//boolean endsWith(String endStr)
		//원본문자열이 인자로 지정된 문자열로 끝나면 true 반환
		System.out.println("원본 문자열이 fff로 끝나는지 판단 : source1.endsWith(\"fff\") : " + source1.endsWith("fff"));
		
		//boolean startsWith(String startStr)
		//원본문자열이 지정된 문자열로 시작되는 지 판단 
		System.out.println("원본문자열이 aaa문자열로 시작되는지 판단 : source1.startsWith(\"aaa\"): "+ source1.startsWith("aaa"));
		
		//boolean contains(String searchStr)
		//원본문자열에 인자로 지정된 문자열이 포함되어 있는지 판단
		System.out.println("원본문자열에 bbb문자열이 포함되어 있는지 판단: source1.contains(\"bbb\") :" + source1.contains("bbb"));

		//int length()
		//문자열의 길이반환
		System.out.println("원본문자열의 길이 : source1.length() :" + source1.length());
		
		//boolean equals(String str)
		//대소문자를 구분하여 문자열 값 비교
		System.out.println("source1 문자열과 source2 문자열을 대소문자를 구분하여 비교 : source1.equals(source2) :" + source1.equals(source2) );
	
		//boolean equalsIgnoreCase(String str)
		//대소문자를 구분하지않고 문자열 값 비교
		System.out.println("source1 문자열과 source2 문자열을 대소문자를 구분하여 비교 : source1.equalsIgnoreCase(source2) :" + source1.equalsIgnoreCase(source2) );
	
		
		//String toUpperCase()
		//문자열을 대문자로 변경
		System.out.println("원본문자열을 대문자로 변경 : source1.toUpperCase() :" + source1.toUpperCase());

		//String toLowerCase()
		//문자열을 대문자로 변경
		System.out.println("원본문자열을 소문자로 변경 : source2.toLowerCase() :" + source2.toLowerCase());

		System.out.println();
		
		//String[] split(String delins);
		//인자로 지정된 구분자를 기준으로 문자열을 분리하는 메소드
		String source3 = "aaa, bbb, ccc";
		System.out.println("원본문자열 : " + source3);
		
		String[] splitStr = source3.split(",");
		System.out.println("String[] splitStr = source3.split(\",\")");
		for(String str : splitStr) {
			System.out.println(str);
		}
		System.out.println();
		
		//String trim()
		//공백제거 
		String source4 = " java ";
		System.out.println("원본문자열 : " +source4+"" );
		System.out.println("공백 제거 후 문자열 : source4.trin(): " + source4.trim() );
		
		
		
	}

}
