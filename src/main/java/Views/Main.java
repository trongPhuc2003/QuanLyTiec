package Views;

import Entity.SanhCuoi;
import Manager.QuanLySanhCuoi;
import java.sql.ClientInfoStatus;
import java.util.Scanner;
import javax.swing.JList;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    QuanLySanhCuoi ql = new QuanLySanhCuoi();
    int luaChon = 0;
    do
    {
      System.out.println("1: Thông tin sảnh cưới");
      System.out.println("2: Thông tin thức ăn, nước uống");
      System.out.println("3: Cho thuê sảnh");
      System.out.println("4: Sắp xếp danh sách sảnh cưới giảm dần theo tần suất");
      System.out.println("5: Xuất hoá đơn");
      System.out.println("6: Doanh thu theo tháng và quý");
      System.out.println("7: Kết thúc");
      luaChon = scanner.nextInt();
      switch (luaChon) {
        case 1:
          System.out.println("1: Thêm sảnh cưới");
          System.out.println("2: Cập nhật sảnh cưới");
          System.out.println("3: Xoá sảnh cưới");
          System.out.println("4: Tra cứu sảnh cưới theo tên sảnh");
          System.out.println("5: Tra cứu sảnh cưới theo sức chứa");
          System.out.println("6: Tra cứu sảnh cưới theo vị trí sảnh");
          System.out.println("7: In danh sách sảnh cưới");
          int chon = scanner.nextInt();
          switch (chon) {
            case 1:
              System.out.printf("Nhap mã sảnh: ");
              scanner.nextLine();
              String maSC = scanner.nextLine();
              System.out.print("Nhập tên sảnh: ");
              String tenSC = scanner.nextLine();
              System.out.print("Nhập vị trí sảnh:");
              String viTriSC = scanner.nextLine();
              System.out.print("Nhập sức chứa: ");
              int sucChua = scanner.nextInt();
              System.out.print("Nhap gia thue: ");
              double donGia = scanner.nextDouble();
              SanhCuoi sanhCuoi = new SanhCuoi(maSC, tenSC, viTriSC, sucChua, donGia);
              ql.themSC(sanhCuoi);
              break;
            case 3:
              ql.xoaSC(scanner);
              break;
            case 6:
              System.out.print("Nhap vi tri: ");
              scanner.nextLine();
              String viTri = scanner.nextLine();
              ql.traCuu(viTri).forEach(s -> {
                System.out.println(s.toString());
              });
              break;
            case 7: {
              ql.inDanhSachBuoiTiec();
              break;
            }
          }
          break;
        case 2:
          System.out.println("1: Thêm dịch vụ");
          System.out.println("2: Cập nhật dịch vụ");
          System.out.println("3: Xoá dịch vụ");
          System.out.println("4: Tra cứu dịch vụ theo tên dịch vụ");
          break;
      }
    }while (luaChon != 2);
  }

}
