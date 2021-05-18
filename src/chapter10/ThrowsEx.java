package chapter10;

public class ThrowsEx {

	public static void main(String[] args) {
//		findClass();
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
//		try {
//			Class clazz = Class.forName("java.lang.String2");
//		}catch(ClassNotFoundException e) {
//			System.out.println("오류가 발생했습니다.");
//		}
	}
}
