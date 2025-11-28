public class test{
int _size;
int top;
int []stack;
test(int size){
_size=size;
top=-1;
stack=new int[size];

}
boolean isEmpty(){
   return (top=-1); 

}
boolean isFull(){
    return (top=_size-1);
}
void push(int item){
  if( isFull()){
    System.out.println("The Stack Is Full .Cannot Push");
  }
  else{
    top++;
    stack[top]=item;
    System.out.println("The Item Is Pushed.");
  }

}
int pop(int item){
    if (isEmpty()){
        System.out.println("The Stack IS is Empty, Cannot Pop.");
    }
    else{
        top--;
       item= stack[top];
       
    }
    return item;
}
void display(){
    for (int i=0;i<stack.length;i++){
        System.out.println(stack[i]);
    }
}
}
 public static void main(String[] args){
test a=new test(5);
a.push(19);
a.push(19);
a.push(19);
a.push(19);
a.display();
 }
        


        
        


        
        

    















