let stack = []

// to add an element to stack we use push operation all though javasscript does not have a stack data structure but we can implement it using an array

stack.push(10)
stack.push(1)
stack.push(11)
stack.push(9)
stack.push(8)
console.log(stack);

// to remove an element from stack we use pop operation to will remove the last element added to the stack

stack.pop()
console.log(stack);

// to get the top element of the stack we can use peek operation which will return the last element added to the stack without removing it

console.log(stack[stack.length -1]);// this will work as top operation 

//javascript does not have in built funtion like isEmpty but we can crete our own function to check wether the stack is full / empty 

function isEmpty(stack){
    return stack.length === 0;
}
console.log(isEmpty(stack)); 

// there is no errors like stack overflow or stack underflow in javascript but we can create our own function to check for these errors

