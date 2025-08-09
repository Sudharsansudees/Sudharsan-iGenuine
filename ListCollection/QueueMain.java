package ListCollection;

public class QueueMain {
    public static void main(String[] args) {
        QueueInt q = new QueueInt(8);
        QueueInt q1 = new QueueInt(8);
        QueueInt output1 = new QueueInt(10);

        StackInt output = new StackInt(10);
        StackInt temp1 = new StackInt(10);

        QueueInt temp = new QueueInt(10);



        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);







        //Task 2
//        int size=q.maxSize;
//        while (!q.isEmpty()){
//            q1.enQueue(q.poll());
//
//
//        }
//        for (int i=0;i<size/2;i++){
//            q.enQueue(q1.poll());
//        }
//
//        while (!q.isEmpty() && !q1.isEmpty()){
//            temp.enQueue(q.poll());
//            temp.enQueue(q1.poll());
//        }
//
//        temp.display();

//        q.display();
//        q1.display();















         //Problem 1
//        int k=3;
//
//        for(int i=0;i<k;i++){
//            output.Push(q.poll());
//        }
//        while (!output.isEmpty()){
//            temp.enQueue(output.Pop());
//        }
//        while (!q.isEmpty()){
//            temp.enQueue(q.poll());
//        }
//
//        temp.display();


//        q.display();

//        q1.enQueue(3);
//        q1.enQueue(6);
//        q1.enQueue(5);
//        q1.enQueue(2);
//        q1.enQueue(10);



//        int k=11;
//        while (!q.isEmpty() && !q1.isEmpty()){
//            int a=q.poll();
//            int b=q1.poll();
//            int sum=a+b;
//
//            if(sum==k){
//                output.enQueue(a);
//                output.enQueue(b);
//            }
//        }
//        output.display();



        //Task 2
//        while (!q.isEmpty() && !q1.isEmpty()){
//            int s1=q.poll();
//            int s2=q1.poll();
//            int sum;
//
//            if(s1%2==0){
//                sum=s1+s2;
//                output.enQueue(sum);
//            }else {
//                sum=s1-s2;
//                output.enQueue(sum);
//            }
//
//
//
//        }
//        while (!q.isEmpty() || !q1.isEmpty()){
//            if(!q.isEmpty()){
//                output.enQueue(q.poll());
//            }else{
//                output.enQueue(q1.poll());
//            }
//        }
//
//
//
//        output.display();




        //Task 1 Prime Number

//        for (int i = 1; i <= 5; i++) {
//            q.enQueue(i);
//        }
//        for (int i = 6; i <= 10; i++) {
//            q1.enQueue(i);
//        }
//
//        while (!q.isEmpty() && !q1.isEmpty()) {
//            int s1 = q.poll();
//            int s2 = q1.poll();
//            int sum = s1 + s2;
//
//            output.enQueue(sum);
//        }
//
//        while (!output.isEmpty()){
//
//            int n=output.poll();
//            //int count=0;
//            boolean isPrime=true;
//
//            for(int i =2;i<n;i++){
//                if(n%i==0){
//                    isPrime=false;
////                    count++;
//                    break;
//                }
//
//
//            }
//            if(isPrime){
//                temp.enQueue(n);
//            }
////            if(count==0 && n>1){
////                temp.enQueue(n);
////            }
//            else {
//                System.out.print("Null ");
//            }
//        }
//
//
//        temp.display();


    }
}
