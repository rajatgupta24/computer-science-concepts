public class CallByRefrence {
    int data=50;
    
    void changebyvalue(int data){
        data=data+100; //changes will be in the local variable only
    }
        
    void changebyrefrence(CallByRefrence op){
        op.data=op.data+100; //changes will be in the instance variable
    }
    
    public static void main(String args[]){
        CallByRefrence op = new CallByRefrence();
        System.out.println("before change"+op.data);
        op.changebyvalue(500);
        System.out.println("after change"+op.data);
        System.out.println("before change"+op.data);
        op.changebyrefrence(op);
        System.out.println("after change"+op.data);
    }
}
