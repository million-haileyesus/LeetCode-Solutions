public class ImplementStackUsingQueuesSolution {
    private int[] items;
    private int top;
    public MyStack() {
        items = new int[5];
        top = -1;
    }
    
    public void push(int x) {
        if(items.length == top + 1) {
            int[] temp = new int[items.length << 1];
            for(int i = 0; i < items.length; i++) {
                temp[i] = items[i];
            }
            items = temp;
        }
        items[++top] = x;
    }
    
    public int pop() {
        int result = 0;
        if(top != -1) {
            result = items[top];
            items[top--] = 0;
        }
        return result;
    }
    
    public int top() {
        int result = 0;
        if(top != -1) {
            result = items[top];
        }
        return result;
    }
    
    public boolean empty() {
        return (top == -1);
    }
}
