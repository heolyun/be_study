package quiz33;

public class Quiz33 {


		public static double avg(int[] arr) {
			int sum = 0;
			for (int num : arr) {
				sum += num;
			}
			return (double) sum / arr.length;
		}

		public static int maximum(int[] arr) {
			int max = arr[0];
			for (int num : arr) {
				if (num > max) {
					max = num;
				}
			}
			return max;
		}

		public static void increase(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				arr[i]++;
			}
		}

		public static int[] create(int length) {
		    int[] arr = new int[length];
		    for (int i = 0; i < length; i++) {
		        arr[i] = i + 1;
		    }
		    return arr;
		}

		public static void reverse(int[] arr) {
			int start = 0;
			int end = arr.length - 1;
			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}

		public static void main(String[] args) {

			// 1. 정수 배열을 만들어 모든 요소 출력
			int[] arr1 = { 1, 2, 3, 4, 5 };
			System.out.println("1. 배열 요소 출력:");
			for (int num : arr1) {
				System.out.print(num + " ");
			}
			System.out.println();

			// 2. 길이 5 배열 만들고 2번 인덱스에 50 넣기
			int[] arr2 = new int[5];
			arr2[2] = 50;
			System.out.println("2. arr2[2] = " + arr2[2]);

			// 3. 배열의 길이 출력
			System.out.println("3. 배열의 길이: " + arr2.length);

			// 4. 배열 요소들의 합 구하기
			int sum = 0;
			for (int num : arr1) {
				sum += num;
			}
			System.out.println("4. 합계: " + sum);

			// 5. for 문으로 배열 요소 출력
			System.out.println("5. for문으로 출력:");
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
			System.out.println();
			// 6. 평균 구하는 메서드 사용
			System.out.println("6. 평균: " + avg(arr1) + "\n");

			// 7. 가장 큰 값 리턴
			System.out.println("7. 가장 큰 값: " + maximum(arr1) + "\n");

			// 8. 모든 요소 1 증가시키기 (원본 변경)
			increase(arr1);
			System.out.println("8. 요소 1 증가 후:");
			for (int num : arr1) {
				System.out.print(num);
			}
			System.out.println();

			// 9. 길이 4인 배열 만들기
			int[] newArr = create(4);
			System.out.println("9. 새로 만든 배열 (길이 4):");
			for (int num : newArr) {
				System.out.print(num);
			}
			System.out.println();

			// 10. 배열 뒤집기
			reverse(arr1);
			System.out.println("10. 배열 뒤집기:");
			for (int num2 : arr1) {
				System.out.print(num2);

				}
			}
		}
	
