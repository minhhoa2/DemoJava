/**
viết thêm hàm constructor có tham số và hàm ko có tham số
 */
class Student5 {
    int id;
    String name;
    int age;

    Student5(int i, String n) {
        id = i;
        name = n;
    }

    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    Student5(String n) {
        name = n;
    }
    Student5() {
    }
    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student5 s1 = new Student5(111, "Viet");
        Student5 s2 = new Student5(222, "Tuts", 25);
        Student5 s3 = new Student5("Viet1");
        Student5 s4 = new Student5 ();
        s1.display();
        s2.display();
    }
}
