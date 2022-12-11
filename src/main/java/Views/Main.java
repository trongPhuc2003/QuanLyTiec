package Views;

import Entity.SanhCuoi;
import Manager.QuanLySanhCuoi;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    QuanLySanhCuoi ql = new QuanLySanhCuoi();
    int luaChon = 0;
    do
    {
      System.out.println("1: Thêm thông tin sảnh cưới");
      System.out.println("2:  ");
      System.out.println("3: ");
      System.out.println("4: ");
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
          System.out.printf("Nhap ma sanh cuoi: ");
          scanner.nextLine();
          String m = scanner.nextLine();
          SanhCuoi sc = new SanhCuoi(m);
          System.out.println("Xoa sanh cuoi " + ql.xoaSC(sc));
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
