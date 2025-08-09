package ListCollection;

public class StackMain {
    public static void main(String[]args){


        StackPro s = new StackPro(5);
        StackPro s1 = new StackPro(5);
//
        StackPro output = new StackPro(10);
        StackPro temp = new StackPro(10);
//
//
        s.Push("Java");

        String count=s.Peek();
        int size=count.length();



        for(int i=0;i<size;i++){

            output.Push(String.valueOf(count.charAt(i)));
        }
        String c1 = "";

        while (!output.isEmpty()){
            c1+=output.Pop();
        }
        System.out.print(c1);





//        temp.Push(output.Pop());

//        s.Push(34);
//        s.Push(3);
//        s.Push(31);
//        s.Push(98);
//        s.Push(23);

//        s1.Push(1);
//        s1.Push(3);
//        s1.Push(5);
//        s1.Push(7);
//        s1.Push(9);

        //Task 3
//        while (!s.isEmpty() && !s1.isEmpty()){
//            int Stack1= s.Pop();
//            int Stack2= s1.Pop();
//            int sum=Stack1+Stack2;
//
//            if(sum%2==0){
//                output.Push(Stack1);
//                output.Push(Stack2);
//            }else{
//                output.Push(Stack2);
//                output.Push(Stack1);
//
//            }
//
//        }
//        while (!output.isEmpty()){
//            temp.Push(output.Pop());
//        }
//
//        temp.display();


        //Task 4
//        int size = s.length();
//        int size1=s1.length();
//        int extra=size1-size;
//
//
//
//        for(int i=0;i<extra;i++){
//            output.Push(s1.Pop());
//        }
//
//
//
//
//
//
//
//        while (!s.isEmpty() && !s1.isEmpty()){
//            output.Push(s.Pop());
//            output.Push(s1.Pop());
//        }
//        output.display();



//        Task 2:
//        while (!s.isEmpty() && !s1.isEmpty()){
//            int t1=s.Pop();
//            int t2= s1.Pop();
//
//            if(t1<t2){
//                output.Push(t1);
//            }
//            else{
//                output.Push(t2);
//            }
//
//        }
//        output.display();

//        while (!s.isEmpty()) {
//            int a = s.Pop();
//            while (!output.isEmpty() && output.Peek() < a) {
//                s.Push(output.Pop());
//            }
//            output.Push(a);
//        }
//        output.display();


////        s.Pop();
////        output.Push(s.Peek());
//        output.display();




    }
}
