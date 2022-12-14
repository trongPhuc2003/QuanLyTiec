package Manager;

import Entity.BuoiTiec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class QuanLyBuoiTiec {

  private List<BuoiTiec> dsBuoiTiec = new ArrayList<>();
  private QuanLySanhCuoi qlsc = new QuanLySanhCuoi();

  public void showQlsc() {
    this.getQlsc().show();
  }

  public void themBuoiTiec(BuoiTiec... bt) {
    this.dsBuoiTiec.addAll(Arrays.asList(bt));
  }

  public void showTatCa() {

    this.dsBuoiTiec.forEach(s -> s.showTatCaC());
  }
  public void doanhThuThang(int thang) throws ParseException {
    int tong = 0;
    for (BuoiTiec bt : dsBuoiTiec) {
      Date d = new SimpleDateFormat("dd/MM/yyyy").parse(bt.getSanhCuoi().getNgay());
      if (d.getMonth() == thang - 1) {
        tong += bt.tongTien();
      }
    }
    System.out.println("Tong doanh thu thang " + thang + " la: " + tong);
  }
  public void doanhThuQuy(int quy, int nam) throws ParseException {
    int tong = 0;
    int temp = quy * 3;

    for (BuoiTiec bt : dsBuoiTiec) {
      Date d = new SimpleDateFormat("dd/MM/yyyy").parse(bt.getSanhCuoi().getNgay());
      if (d.getMonth() <= temp - 1 && d.getMonth() >= temp - 3 && d.getYear() + 1900 == nam) {
        tong += bt.tongTien();
      }
    }
    System.out.println("Tong doanh thu quy " + quy + " cua nam " + nam + " la: " + tong);
  }

  public void show() {

    this.dsBuoiTiec.forEach(s -> s.show());
  }

  public List<BuoiTiec> getDsBuoiTiec() {
    return dsBuoiTiec;
  }

  public void setDsBuoiTiec(List<BuoiTiec> dsBuoiTiec) {
    this.dsBuoiTiec = dsBuoiTiec;
  }

  public QuanLySanhCuoi getQlsc() {
    return qlsc;
  }

  public void setQlsc(QuanLySanhCuoi qlsc) {
    this.qlsc = qlsc;
  }
}
