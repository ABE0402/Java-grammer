//String 객체 생성 방식 
public class StringTest1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //1. 문자열 상수로 생성
      //동일한 문자열 상수로 객체를 생성하면 새로운 객체가 생성되는 것이 아니고 
      //기존에 동일한 문자열 상수로 생성된 객체를 래퍼런스 한다.
      String string1 = "aaa";
      String string2 = "aaa";
      
      //참조 값 비교
      System.out.println("string1 == string2 :" + (string1 == string2));
      //문자열 상수 (객체)의 내용을 비교 
      System.out.println("string1.equals(string2) :" + (string1.equals(string2)));
      
      String string3 = new String("bbb");
      String string4 = new String("aaa");
      
      //참조 값 비교
      System.out.println("string3 == string4 :" + (string3 == string4));
      //문자열 상수 (객체)의 내용을 비교 
      System.out.println("string3.equals(string4) :" + (string3.equals(string4)));
      
      //결론은 자바에서 문자열 비교할때는 == 사용하지 말고 equals 나 contentEquals 를 사용해라.
      
      
   }

}