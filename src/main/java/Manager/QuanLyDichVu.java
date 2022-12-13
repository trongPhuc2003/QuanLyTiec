package Manager;

import Entity.DichVu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyDichVu {
 private List<DichVu> dsDv = new ArrayList<>();
 Scanner scanner = new Scanner(System.in);
  public void themDv(DichVu... dv) {

    this.getDsDv().addAll(Arrays.asList(dv));
  }

  public void xoaDv(DichVu dv) {

    this.getDsDv().remove(dv);
  }

  public void xoa(double gia) {
    this.getDsDv().remove(gia);
  }

  public void capNhat(DichVu dv) {
    System.out.print("Mã dịch vụ mới: ");
    dv.setMaDV(scanner.nextLine());
    System.out.print("\nTên dịch vụ mới:");
    dv.setTenDV(scanner.nextLine());
    System.out.print("\nGiá mới:");
    dv.setGiaDV(scanner.nextInt());

  }

  public int docFileCaSi(String ten) throws FileNotFoundException {
    File f = new File("D:\\Code\\QuanLyTiec\\src\\main\\resources\\DichVu\\ThueCaSi.txt");
    try ( Scanner sc = new Scanner(f)) {
      while (sc.hasNext()) {
        String dv = sc.nextLine();
        if (dv.equals(ten)) {
          int p = Integer.parseInt(sc.nextLine());
          return p;
        }
      }
    }
    return 0;
  }

  public int docFileKaraoke() throws FileNotFoundException {
      File f = new File("D:\\Code\\QuanLyTiec\\src\\main\\resources\\DichVu\\Karaoke.txt.txt");
      try ( Scanner sc = new Scanner(f)) {
        while (sc.hasNext()) {
          int dv = Integer.parseInt(sc.nextLine());
          return dv;
        }
      }
    return 0;
  }

  public int docFileTrangTri(String yeuCau) throws FileNotFoundException {
    File f = new File("D:\\Code\\QuanLyTiec\\src\\main\\resources\\DichVu\\TrangTri.txt");
    try ( Scanner sc = new Scanner(f)) {
      while (sc.hasNext()) {
        String dv = sc.nextLine();
        if (dv.equals(yeuCau)) {
          int p = Integer.parseInt(sc.nextLine());
          return p;
        }
      }
    }
    return 0;
  }

  public void show() {
    this.dsDv.forEach(s -> s.show());
  }

  public int calcTotal() {
    int sum = 0;
    for (DichVu dv : dsDv) {
      sum += dv.getGiaDV();
    }
    return sum;
  }

  public List<DichVu> traCuuDcv(String diVu) {
    return this.dsDv.stream().filter(s -> s.getTenDV().contains(diVu)).collect(Collectors.toList());
  }
  public List<DichVu> getDsDv() {
    return dsDv;
  }

  public void setDsDv(List<DichVu> dsDv) {
    this.dsDv = dsDv;
  }
}
