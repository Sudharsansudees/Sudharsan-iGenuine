package ListCollection;

public class QueueStringMain {
    public static void main(String[] args) {
        Queue q = new Queue(50);
        q.enQueue("aabcddbeaadc");
        String s = q.poll();

        for (int i = 0; i < s.length(); i++) {
            q.enQueue(String.valueOf(s.charAt(i)));
        }

        int size = q.length();

        for (int i = 0; i < size; i++) {
            String current = q.poll();
            int count = 0;
            q.enQueue(current);

            int size1 = q.length();
            for (int j = 0; j < size1; j++) {
                String temp = q.poll();
                if (current.equals(temp)) {
                    count++;
                }
                q.enQueue(temp);
            }

            if (count == 1) {
                System.out.println(current);
                break;
            }
        }
    }
}




//        while (!q.isEmpty()){
//            String a = q.element();
//            int count=0;
//            for (int i=0;i<q.length;i++){
//
//                if(a.equals(q.element())){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.println(a);
//                return;
//            }
//        }

//        for (int i = 0; i < s.length(); i++) {
//            char a = s.charAt(i);
//            int count = 0;
//
//            for (int j = 0; j < s.length(); j++) {
//                if (a == s.charAt(j)) {
//                    count++;
//                }
//            }
//
//            if (count == 1) {
//                System.out.println(a);
//                return;
//            }
//        }

//
//    }
//}
