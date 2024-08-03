package stack;

public class a {
    public static void main(String[] args) {

        stack st=new stack();
        st.push(12);
        st.push(28);
        st.push(34);

        st.display();


    }
}

class stack{
    int top=-1;
    int arr[]=new int[20];
    void push(int n){

        if(top>20){
            System.out.println("stack overflow");
        }
        top++;
        arr[top]=n;

    }
    void pop(){
        int x=arr[top];
        top--;
        System.out.println(x);

    }
    void size(){
        System.out.println(top+1);
    }

    int peek(){
        return arr[top];
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.print((arr[i]));
            System.out.println(" ");
        }
    }




}
