package Manager;

import Entity.SanhCuoi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySanhCuoi {

  private List<SanhCuoi> dsSanhCuoi = new ArrayList<>();

  public void themSC(SanhCuoi sc) {

    this.dsSanhCuoi.add(sc);
  }
  public boolean xoaSC(SanhCuoi sc) {
   return this.dsSanhCuoi.remove(sc);
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
