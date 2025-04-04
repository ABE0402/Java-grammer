
public sealed class SealedClassesTest permits A, B {
}

//이 클래스는 상속받을 수 없는 클래스로 지정
final class A extends SealedClassesTest{
	
}

//class D extends A{
//	이건 오류 발생
//}

//다른 클래스들이 B 클래스를 상속할 수 있게 처리
non-sealed class B extends SealedClassesTest{
	
}

class C extends B{
	
}