package Manager;

import Entity.SanhCuoi;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLySanhCuoi {

  private List<SanhCuoi> dsSanhCuoi = new ArrayList<>();

  public void themSC(SanhCuoi... sc) {

    this.dsSanhCuoi.addAll(Arrays.asList(sc));
  }
  public void xoa(SanhCuoi sc) {
    this.dsSanhCuoi.remove(sc);
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
  public void sapXep() {
    this.dsSanhCuoi.sort((sc1, sc2) -> {
      int ts1 = sc1.getTanSuat();
      int ts2 = sc2.getTanSuat();

      return (ts1 > ts2 ? 1 : (ts1 < ts2 ? -1 : 0));
    });
  }
  public void show(){
    this.dsSanhCuoi.forEach(s->s.show());
  }
  public List<SanhCuoi> traCuuTen(String ten) {
    return this.dsSanhCuoi.stream().filter(sc -> sc.getTenSC().contains(ten)).collect(Collectors.toList());
  }
  public SanhCuoi traCuuChua(int sucChua) {
    return this.dsSanhCuoi.stream().filter(sc -> sc.getSucChua() == sucChua).findFirst().get();
  }

  public List<SanhCuoi> traCuu(String viTriSC) {
    return this.dsSanhCuoi.stream().filter(sc -> sc.getViTriSC().contains(viTriSC)).collect(Collectors.toList());
  }
  public void docFileSanh() throws FileNotFoundException, ParseException {
    File f = new File("D:\\Code\\QuanLyTiec\\src\\main\\resources\\SanhCuoi\\SanhCuoi.txt");
    try (Scanner scf = new Scanner(f)) {
      while (scf.hasNext()) {
        String n1 = scf.nextLine();
        String n2 = scf.nextLine();
        int n3 = Integer.parseInt(scf.nextLine());
        this.dsSanhCuoi.add(new SanhCuoi(n1,n2,n3));
      }
    }
  }
  public List<SanhCuoi> getDsSanhCuoi() {

    return dsSanhCuoi;
  }

  public void setDsSanhCuoi(List<SanhCuoi> dsSanhCuoi) {

    this.dsSanhCuoi = dsSanhCuoi;
  }
}
