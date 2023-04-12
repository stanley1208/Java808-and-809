
public class Test12 {
	public static void main(String[] args) {
		int[] stack = {10, 20, 30};
		int size = 3;
		int idx = 0;
//		do {
//			idx++;
//			} while (idx < size - 1);
//		do {
//			idx++;
//			} while (idx >= size);
//		do {
//			idx++;
//			} while (idx <= size);
//		while (idx <= size - 1) {
//			idx++;
//			}
		while (idx < size - 1) {
			idx++;
			}

		System.out.print("The Top element: " + stack[idx]);
		}

}
