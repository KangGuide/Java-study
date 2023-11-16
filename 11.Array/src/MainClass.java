
public class MainClass {

	public static void main(String[] args) {
		/*
		 	Array : 배열
		 			같은 자료형의 변수들의 묶음
		 			변수의 확장기능
		 			관리를 용이하게 하기 위한 목적
		 			번호(index)로 접근 및 관리 
		 			
		 	int num1, num2, num3, num4....
		 	
		 	형식:
		 		자료형 (배열)변수명[] = new 자료형[배열의 갯수];
		 							동적할당 <> 정적
		 		변수명[0 ~ (배열의 갯수-1)]
		 	
		 	pointer
			-> int *po; == int arr[]; 				 									 
		 */
		int num1, num2, num3, num4, num5;
		num1 = 1;
		num2 = 2;
		num3 = 3;
		num4 = 4;
		num5 = 5;
		
//		int arrNum[] = new int[5];	// 여기서부터
//		int []arrNum = new int[5];
//		int[] arrNum = new int[5];  
		int arrNum[]; 				// 여기까지 전부다 같은방법
		arrNum = new int[5];  // new를 사용한경우 = 0 이아니고 = null 로 초기화 해야한다
		
		arrNum[0] = 1;	// 0: index number 0번지
		arrNum[1] = 2;
		arrNum[2] = 3;
		arrNum[3] = 3;
		arrNum[4] = 3;
		System.out.println(arrNum);
		
		// delete[] arrnum; garbage collection이 생겨서 자바에서 쓰지 않는다
		
		int num11 = 0, num22 = 1, num33 = 2, num44 = 3, num55 = 4;
		
		// 배열의 초기화
//		int numArr[] = { 0, 1, 2, 3, 4};
//		System.out.println(numArr[3]);
		
		int numArr[] = null;
//		numArr = { 0, 1, 2, 3, 4};	 // 자바 사용 못함 but 파이썬, C언어는 가능
		numArr = new int[5];
		numArr[0] = 0;
		numArr[1] = 1;
		numArr[2] = 2;
		numArr[3] = 3;
		numArr[4] = 4;
		
		System.out.println(arrNum[7]); // 배열의 값을 정해주지 않았기 때문에 0으로 나온다
		
		// 배열의 길이
		System.out.println(numArr.length);
		
		// 배열 별명(alias)
		int aNum[] = numArr;
		System.out.println(aNum[0]);
		System.out.println(aNum[1]);
		System.out.println(aNum[2]);
		System.out.println(aNum[3]);
		System.out.println(aNum[4]);
		
		aNum[3] = 33;
		System.out.println(numArr[3]);	
		// 두 배열값을 같다고 했을경우 주소가 같기 때문에 한쪽의 값을변경하면 반대쪽 값도 같이 변경된다
		System.out.println(numArr);
		System.out.println(aNum);
		
		String str = null;		
		
	}

}

