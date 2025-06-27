public class Queue {
    // create a class of queue and declare require variable
    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;

        // create a constructure of the class
        queue(int size){
            arr = new int[size];
            this.size = size;
        }

        //create a (boolean type)function to check weather queue is empty or not
        public static boolean isEmpty(){
            return rear == -1;
        }

        //enqueue
        //enqueue function will add element from rare
        public static void add(int data){
            /*
            first check weather there is any empty space to insert an element as we are implementing queue using arrays
            which are fixed in size
             */
            if(rear == size -1 ){
                System.out.println("the queue is already full");
                return;
            }
            /*
            initially (while queue is empty) rare and front are -1 when we further insert elements front will remain at 0
            and rare increment respectively with no of elements
             */
            rear++;
            /* increment rear every time before inserting any element because initially its pointing towards the last
             entered element and when we want to add an element we need an empty index where is can insert the element
             otherwise it will overwrite the last element everytime
             */
            arr[rear] = data;
        }

        //dequeue
        //dequeue function will remove the element from the front
        public static int remove() {
            //check whether the queue is already empty oor not
            if (isEmpty()) {
                System.out.println("the queue is already empty");
                return -1;
            }

            //declare front to the first index to the queue from where elements will get removed
            int front = arr[0];

            /*after every removal of the element, we need to shift all the elements 1 index forward (right to left) as an
            empty space will be there(so our front will not point an empty space after removal of the element)
             */
            for(int i = 0 ; i < rear ; i++){
                arr[i] = arr[i+1];
            }
            //declare the rear as we have shifted all the elements
            rear--;
            return front;
        }

        //peek
        //peek function will return last entered element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("the queue is already full");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        //create an object of the queue in the main function and perform all the functions
        queue q = new queue(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // removal should be like 1234.....
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.isEmpty());
    }
}
