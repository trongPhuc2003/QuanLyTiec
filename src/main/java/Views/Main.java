package Views;

import Entity.BuoiTiec;
import Entity.SanhCuoi;
import Manager.QuanLyBuoiTiec;
import Manager.QuanLySanhCuoi;
import java.io.FileNotFoundException;
import java.sql.ClientInfoStatus;
import java.sql.Savepoint;
import java.text.ParseException;
import java.util.Scanner;
import javax.swing.JList;

public class Main {

  public static void main(String[] args) throws FileNotFoundException, ParseException {
    Scanner scanner = new Scanner(System.in);

    QuanLySanhCuoi ql = new QuanLySanhCuoi();
    QuanLyBuoiTiec qlbt = new QuanLyBuoiTiec();
    BuoiTiec b = new BuoiTiec();
    int luaChon = 0;
    do
    {
      System.out.println("1: Thuê sảnh cưới");
      System.out.println("2: Sắp xếp danh sách sảnh cưới giảm dần theo tần suất");
      System.out.println("3: Xuất hoá đơn");
      System.out.println("4: Doanh thu theo tháng và quý");
      System.out.println("5: Thông tin sảnh cưới");
      System.out.println("5: Kết thúc");
      luaChon = scanner.nextInt();
      switch (luaChon) {
        case 1:
//          System.out.println("1: Thêm sảnh cưới");
//          System.out.println("2: Cập nhật sảnh cưới");
//          System.out.println("3: Xoá sảnh cưới");
//          System.out.println("4: Tra cứu sảnh cưới theo tên sảnh");
//          System.out.println("5: Tra cứu sảnh cưới theo sức chứa");
//          System.out.println("6: Tra cứu sảnh cưới theo vị trí sảnh");
//          int chon1 = scanner.nextInt();
//          switch (chon1) {
//            case 1:
////              System.out.print("Nhập tên sảnh: ");
////              scanner.nextLine();
////              String tenSC = scanner.nextLine();
////              System.out.print("Nhập vị trí sảnh:");
////              String viTriSC = scanner.nextLine();
////              System.out.print("Nhập sức chứa: ");
////              int sucChua = scanner.nextInt();
////              SanhCuoi sanhCuoi = new SanhCuoi(tenSC, viTriSC, sucChua);
////              ql.themSC(sanhCuoi);
//              ;
//
//              ql.themSC();
//              break;
//            case 3:
//              ql.xoaSC(scanner);
//              break;
//            case 4:
//              System.out.print("Nhập tên sảnh: ");
//              scanner.nextLine();
//              String ten = scanner.nextLine();
//              ql.traCuuTen(ten).forEach(s -> {
//                System.out.println(s.toString());
//              });
//            case 5:
//              System.out.print("Nhập sức chứa: ");
//              scanner.nextLine();
//              int sucCh = scanner.nextInt();
//              ql.traCuuChua(sucCh);
//            case 6:
//              System.out.print("Nhập vi tri: ");
//              scanner.nextLine();
//              String viTri = scanner.nextLine();
//              ql.traCuu(viTri).forEach(s -> {
//                System.out.println(s.toString());
//              });
//              break;
//            case 7: {
//              break;
//            }
//          }
          b.nhapBuoiTiec();
          qlbt.themBuoiTiec(b);
          qlbt.showTatCa();
          break;
        case 2:
          ql.sapXep();
          break;
        case 3:
          b.xuatHoaDon();
          break;
        case 4:
          System.out.print("Nhập tháng: ");
          int thang = scanner.nextInt();
          qlbt.doanhThuThang(thang);
          System.out.println("Nhập quý: ");
          int quy = scanner.nextInt();
          System.out.println("Nhập năm: ");
          int nam = scanner.nextInt();
          qlbt.doanhThuQuy(quy, nam);
          break;
        case 5:
          break;
        case 6:
          System.out.println("Kết thúc chương trình!\n");
          break;
      }
    }while (luaChon != 7);
  }

}
