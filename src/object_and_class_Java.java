/**Sửa lại class Student3 trên có thêm các thuộc tính : age , address
 * sửa lại hàm contructor để gán các giá trị các thuộc tính đó cho studen
 *
 */

public class object_and_class_Java {
    int id;
    String name;
    int age;

    // constructor
    public object_and_class_Java(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // phương thức displayInformation
    void displayInformation() {
        System.out.println(id + " " + name + age );
    }

    public static void main(String args[]) {
        object_and_class_Java s1 = new object_and_class_Java(111, "Viet", 24);
        object_and_class_Java s2 = new object_and_class_Java(222, "Tuts", 24);

        s1.displayInformation();
        s2.displayInformation();
    }
}
