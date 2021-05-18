package chapter10;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:\\Users\\Ghost\\Desktop\\SW개발자\\workspace\\resource.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
