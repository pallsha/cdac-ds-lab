
public class TestQueueUsingArray {
	public static void main (String[] s) {
		Queue q = new Queue(5);
		q.enqueue(56);
		q.enqueue(6);
		q.enqueue(9);
		q.enqueue(4);
		q.enqueue(5);
		q.display();
		q.dequeue();
		q.dequeue();
		q.enqueue(3);
		System.out.println("");
		q.display();
		
		
	}
}

class Queue{
	int size;
	int [] arr;
	int front = -1, rear = -1;

	Queue(int size){
		this.size = size;
		arr= new int[size];
	}

	void enqueue(int element){
		//overflow conditions
		if((rear+1)%size==front){
			throw new RuntimeException("queue full");
		}
		if (rear==-1){
			front=0;
		}
		arr[(rear+1)%size] = element;
		rear = (rear+1)%size;

	}

	int dequeue(){
		//underflow conditions
		if(front==-1){
			throw new RuntimeException("queue empty");
		}
		int element = arr[front];
		if(front==rear){
			front=-1;
			rear=-1;
		}else{
			front = (front+1)%size;
		}
		return element;
	}
	void display() {
		int f = front;
		int r = rear;
		
		while(f!=r) {
			System.out.print(arr[f] + ", ");
			f = (f+1)%size;
		}
		System.out.print(arr[f] );
		
	}

}