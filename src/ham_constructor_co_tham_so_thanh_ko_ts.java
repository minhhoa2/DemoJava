/**
viết thêm hàm constructor có tham số và hàm ko có tham số
 */
        class Student4{
            int id;
            String name;
            Student4() {
                id =12;
                name = "test";
            }
    Student4(String n) {
        name = n;
    }
            Student4(int i,String n) {
                id = i;
                name = n;
            }

            void display() {
                System.out.println(id+" "+name);
            }

            public static void main(String args[]) {
                Student4 s1 = new Student4();
                Student4 s2 = new Student4(222,"Tuts");
                s1.display();
                s2.display();
            }
        }
