package Views;

import Entity.SanhCuoi;
import Manager.QuanLySanhCuoi;

public class Main {

  public static void main(String[] args) {
    SanhCuoi s = new SanhCuoi("hua a", "H1", 200);
    SanhCuoi s2 = new SanhCuoi("hua a", "H1", 200);
    QuanLySanhCuoi ql = new QuanLySanhCuoi();
    ql.themSC(s,s2);
    ql.hienThi();
  }

}
