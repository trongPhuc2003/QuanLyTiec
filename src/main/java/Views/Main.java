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
      System.out.println("1: Thêm thông tin sảnh cưới");
      System.out.println("2: Xoá sảnh cưới theo mã");
      System.out.println("3: Tìm sảnh cưới theo vị trí");
      System.out.println("4: In danh sách sảnh cưới");
      luaChon = scanner.nextInt();
      switch (luaChon)
      {
        case 1:
          System.out.printf("Nhap ma sanh: ");
          scanner.nextLine();
          String maSC = scanner.nextLine();
          System.out.print("Nhập tên sảnh: ");
          String tenSC = scanner.nextLine();
          System.out.print("Nhập vị trí sảnh:");
          String viTriSC = scanner.nextLine();
          System.out.print("Nhập sức chứa: ");
          int sucChua = scanner.nextInt();
          SanhCuoi sanhCuoi = new SanhCuoi(maSC, tenSC, viTriSC, sucChua);
          ql.themSC(sanhCuoi);
          break;
        case 2:
          ql.xoaSC(scanner);

          break;
        case 3:
          System.out.print("Nhap vi tri: ");
          scanner.nextLine();
          String viTri = scanner.nextLine();
          ql.traCuu(viTri).forEach(s -> {
            System.out.println(s.toString());
          });
          break;
        case 4: {
          ql.inDanhSachBuoiTiec();
          break;
        }
      }
    }while (luaChon != 5);
  }

}
