class MyQueue {
public:
    int stack[100];
    int front=-1;
    int rear=-1;
    MyQueue() {
    }
    
    void push(int x) {
        if(front==-1){
            front=0;
            rear=0;
        }else{
            rear++;
        }
        stack[rear]=x;
    }
    
    int pop() {
       int val=stack[front++];
       if(front>rear){
           front=-1;
           rear=-1;
       }
       return val;
    }
    
    int peek() {
        return stack[front];
    }
    
    bool empty() {
        if(front==-1){
            return true;
        }
        if(front>rear){
            return true;
        }
        return false;
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */