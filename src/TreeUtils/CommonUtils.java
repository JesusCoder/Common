package TreeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonUtils {

	private static final int DEFAULT_TREE_SIZE = 10;
	private static final int DEFAULT_UPPER_BOUND = 100;

	public static void print(String message) {
		System.out.print(message);
	}
	
	public static void print(int num) {
		System.out.print(num);
	}

	public static void println(String message) {
		System.out.println(message);
	}
	
	public static void println(int num) {
		System.out.println(num);
	}

	public static void println() {
		System.out.println();
	}

	//overloaded method to take only one argument
	public static List<Integer> randomIntArrayGenerator(int size) {
		return CommonUtils.randomIntArrayGenerator(size, DEFAULT_UPPER_BOUND);
	}

	//overloaded method to take no argument
	public static List<Integer> randomIntArrayGenerator() {
		return CommonUtils.randomIntArrayGenerator(CommonUtils.DEFAULT_TREE_SIZE, DEFAULT_UPPER_BOUND);
	}

	//this one has two other overloaded methods as above
	public static List<Integer> randomIntArrayGenerator(int size, int upperBound) {
		List<Integer> result = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			int randomInt = random.nextInt(upperBound);
			result.add(randomInt);
			print(String.valueOf(randomInt) + " ");
		}
		println();
		return result;
	}

	@Notes(context = "I'm assuing only classes in this PACKAGE will call the following two methods, so just leave the modifier as default, i.e. no public, private, or protected.")
	static void printWhitespaces(int count) {
		for (int i = 0; i < count; i++)
			System.out.print(" ");
	}

	static <T> boolean isAllElementsNull(List<T> list) {
		for (Object object : list) {
			if (object != null)
				return false;
		}
	
		return true;
	}
	
	/**
	 * If you want to print the reversed list out, you need to return the
	 * reversed list's head, which was the end node of the original node. using
	 * the following function.
	 */
	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode previous, current, next;
		previous = head;
		current = head.next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head.next = null;
		return previous;
	}

	public static void printList(ListNode head) {
		System.out.println("--------------------------------------------");
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
		}
		System.out.println();
	}


}
