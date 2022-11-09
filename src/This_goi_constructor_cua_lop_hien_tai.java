public class This_goi_constructor_cua_lop_hien_tai {
    int id;
    String name;

    This_goi_constructor_cua_lop_hien_tai() {
        System.out.println("call Constructor mặc định");
    }

    This_goi_constructor_cua_lop_hien_tai(int id, String name) {
        this(); // nó được sử dụng để gọi Constructor của lớp hiện tại
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        This_goi_constructor_cua_lop_hien_tai e1 = new This_goi_constructor_cua_lop_hien_tai(111, "Viet");
        This_goi_constructor_cua_lop_hien_tai e2 = new This_goi_constructor_cua_lop_hien_tai(222, "Nam");
        e1.display();
        e2.display();
    }
}

