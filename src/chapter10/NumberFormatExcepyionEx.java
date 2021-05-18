package chapter10;

public class NumberFormatExcepyionEx {
	public static void main(String[] args) {
		String data1 = "100"; // 문자열 인 100
		String data2 = "a100"; // 문자열 인 a 와 문자열 인 100 이 합쳐진 문자열

		int value1 = 0;
		int value2 = 0;
		try {
//			문자열인 100을 정수형으로 변환
			value1 = Integer.parseInt(data1);
//			"a100"을 정수형으로 변환을 시도하지만 문자열 a 때문에 정수형으로 변환 되지 못 함
			value2 = Integer.parseInt(data2);

//			int result = value1 + value2;
//			System.out.println(data1 + "+" + data2 + "+" + result);

		} catch (NumberFormatException e) {
			System.out.println("정수로 변환시 오류가 발생 했습니다.");
			System.out.println("기본 값으로 대체 합니다.");
			value1 = 100;
			value2 = 200;
		} finally {
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "+" + result);
		}

	}
}
