package chapter10;

public class NullPointExceptionEx {
	public static void main(String[] args) {
//		참조변수 사용 시 참조변수에 null 값이 저장되어 있는 상태에서 해당 객체의 멤버에 접급하려 할 경우 발생
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (Exception e) {
			System.out.println("오류가 발생 했습니다.");
			data = "오류발생";
			System.out.println(data.toString());
		}

	}
}
