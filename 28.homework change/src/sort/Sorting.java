package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

//	int all; //정렬 숫자
	int num[] = null;
	boolean updown[] = new boolean[1];

public void Input() {
	Scanner sc = new Scanner(System.in);

	int count;
	System.out.print("몇개의 숫자를 정렬하시겠습니까? >> ");
	count = sc.nextInt();
	num = new int[count];
			
	// 숫자들을 입력
	for (int i = 0; i < num.length; i++) {
		System.out.print((i+1) + "번째 숫자를 입력해주세요 >> ");
		num[i] = sc.nextInt();
			}

	// 오름/내림 1
	int ud;
	System.out.print("오름(1) 내림(2) 원하시는 숫자를 입력해주세요 >> ");
	ud = sc.nextInt();
	if(ud == 1) updown[0] = true;
	else		updown[0] = false;		
}

public void Process() {
	int temp;
	 for (int i = 0; i < num.length - 1; i++) {				
		for (int j = i + 1; j < num.length; j++) {
			if (updown[0] == true) {
				if(num[i] > num[j]){
				swap(i, j);
				}
			}
			else{
				if(num[i] < num[j]){
				swap(i, j);
				}
			}
		}			
	 }
}

private void swap(int i, int j) {
	int temp;
	temp = num[i];
	num[i] = num[j];
	num[j] = temp;	
}

public void Print() {
	String str = "오름";
	if (updown[0] == false) str = "내림"; 
	System.out.println("적어주신 " + num.length + "개의 숫자를 " + str + "차순으로 정렬한 결과입니다");
	System.out.println(Arrays.toString(num));
}



}