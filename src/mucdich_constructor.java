/**Bài tập : thêm các thuộc tính : age , gender  ,vào class trên
 *  , viết hàm contructor ko tham số set giá trị cho các thuộc tính đó
 */
class Student3{
    int id;
    String name;
    int age;
    String gender;
    Student3() {
        id =12;
        name= "MH";
        age= 12;
        gender = "male";


        System.out.println(" leuleu");
    }


    void display() {
        System.out.println(id+" "+name+ gender + age );
    }

    public static void main(String args[]) {
        Student3 s1=new Student3();
        s1.display();

    }
}

