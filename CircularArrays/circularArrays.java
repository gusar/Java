import java.util.Arrays;

class queue {

	int count;
	int front;
	int back;
	int[] Array;

	queue(int size) {
		Array = new int[size];
		count = 0;
		front = 0;
		back = 0;
	}

	void add(int number) {
		count++;
		back = (front + count - 1) % Array.length;
		Array[back] = number;
		System.out.println(Arrays.toString(Array)+" Count: "+count
			+" Front: "+front+" Back: "+back+" QUEUED:  "+Array[back]);
	}

	void remove() {
		count--;
		Array[front] = 0;
		System.out.println(Arrays.toString(Array)+" Count: "+count
			+" Front: "+front+" Back: "+back+" REMOVED: "+Array[front]);
		front = (front + 1) % Array.length;
	}
}


class queueTest {

	public static void main(String[] args) {
		queue newQ = new queue(7);

		newQ.add(1);
		newQ.add(2);
		newQ.add(3);
		newQ.remove();
		newQ.add(4);
		newQ.add(5);
		newQ.remove();
		newQ.add(6);
		newQ.add(7);
		newQ.add(8);
		newQ.remove();
		newQ.add(9);
	}
}