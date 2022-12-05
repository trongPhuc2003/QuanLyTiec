package Manager;

import Entity.SanhCuoi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLySanhCuoi {
  private List<SanhCuoi> dsSanhCuoi = new ArrayList<>();

  public void themSC(SanhCuoi sc) {
    this.dsSanhCuoi.add(sc);
  }
  public void themSC(SanhCuoi... sc) {
    this.dsSanhCuoi.addAll(Arrays.asList(sc));
  }
  public void hienThi() {
    this.dsSanhCuoi.forEach(s -> s.hienThi());
  }
  public List<SanhCuoi> getDsSanhCuoi() {
    return dsSanhCuoi;
  }

  public void setDsSanhCuoi(List<SanhCuoi> dsSanhCuoi) {
    this.dsSanhCuoi = dsSanhCuoi;
  }
}
