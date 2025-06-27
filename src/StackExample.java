//implementing stack by extending vector


import java.util.Stack;
// currently we are using in built stack DS provide by java itself for that we need to import this library
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();


        stack.push(226);
        stack.push(55);
        stack.push(56);
        stack.push(1);
        stack.push(4);
        stack.push(65);//last in
        //push operation to insert element
        System.out.println(stack);

        //pop operation for removing elements from top
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());//peek will point last inserted element to the stack

        System.out.println(stack.empty());//it will return true ? if stack is empty : false

        System.out.println(stack.size());//it will return the size of the stack

        System.out.println(stack.search(1));//it will return the index of the element


        for(int i = 0 ; i <= stack.size() -1 ; i++){
            System.out.println(stack.get(i));
        }
    }
}
