package Manager;

import Entity.SanhCuoi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLySanhCuoi {

  private List<SanhCuoi> dsSanhCuoi = new ArrayList<>();

  public void themSC(SanhCuoi sc) {

    this.dsSanhCuoi.add(sc);
  }
  public void xoaSC(Scanner sc) {
    System.out.print("Nhập mã sảnh cưới: ");
    sc.nextLine();
    String m = sc.nextLine();
    SanhCuoi s = null;
    for (SanhCuoi sa : dsSanhCuoi) {
      if(sa.getMaSC().equalsIgnoreCase(m)) {
        s = sa;
        break;
      }
    }
    if(s != null) {
      dsSanhCuoi.remove(s);
      System.out.println("Đã được xoá\n");
    }else {
      System.out.println("Chưa được xoá\n");
    }
  }
  public void inDanhSachBuoiTiec() {
    for (SanhCuoi sc : dsSanhCuoi) {
      System.out.println(sc);
    }
  }
  public SanhCuoi traCuu(int sucChua) {
    return this.dsSanhCuoi.stream().filter(sc -> sc.getSucChua() == sucChua).findFirst().get();
  }
  public List<SanhCuoi> traCuu(String viTriSC) {
    return this.dsSanhCuoi.stream().filter(sc -> sc.getViTriSC().contains(viTriSC)).collect(Collectors.toList());
  }
  public List<SanhCuoi> getDsSanhCuoi() {

    return dsSanhCuoi;
  }

  public void setDsSanhCuoi(List<SanhCuoi> dsSanhCuoi) {

    this.dsSanhCuoi = dsSanhCuoi;
  }
}
