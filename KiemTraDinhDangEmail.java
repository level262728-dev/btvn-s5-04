import java.util.Scanner;

public class KiemTraDinhDangEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập chuỗi từ bàn phím đại diện cho địa chỉ email
        System.out.print("Nhập địa chỉ email cần kiểm tra: ");
        String email = scanner.nextLine();

        // 2. Loại bỏ các khoảng trắng thừa ở đầu và cuối chuỗi
        email = email.trim();

        // 3. Xây dựng biểu thức chính quy (Regex) theo đúng tiêu chí đề bài:
        // - Username: chứa chữ cái, chữ số, dấu chấm (.) hoặc gạch dưới (_) -> ^[a-zA-Z0-9._]+
        // - Ký tự @: phân cách giữa username và domain -> @
        // - Domain: chứa chữ cái, chữ số, có thể chứa dấu chấm (.) -> [a-zA-Z0-9.-]+
        // - Dấu chấm phân cách phần mở rộng miền -> \\.
        // - Đuôi miền (TLD): dài từ 2 đến 6 ký tự, chỉ chứa chữ cái -> [a-zA-Z]{2,6}$
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        // 4. Kiểm tra tính hợp lệ bằng phương thức matches()
        if (email.matches(regex)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }

        scanner.close();
    }
}