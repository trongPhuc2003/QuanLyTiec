package Manager;

import Entity.ThucAn;
import Entity.ThucPham;
import Entity.ThucUong;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyThucPham {
  private List<ThucPham> dsTp = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);
  public void themTp(ThucPham... tp){

    this.getDsTp().addAll(Arrays.asList(tp));
  };

  public void xoaTp(ThucPham d){

    this.getDsTp().remove(d);
  }

  public void nhapTp(ThucPham d){
    System.out.print("Tên món:");
    d.setTenTp(scanner.nextLine());
    System.out.print("Giá món:");
    d.setGiaTp(scanner.nextDouble());
  }

  public void docFileTa() throws FileNotFoundException, ParseException {
    File f = new File("D:\\Code\\QuanLyTiec\\src\\main\\resources\\ThucPham\\ThucAn.txt");
    try ( Scanner sc = new Scanner(f)) {
      while (sc.hasNext()) {
        String ten = (sc.nextLine());
        Double gia = (Double.valueOf(sc.nextLine()));
        Boolean anChay = (Boolean.valueOf(sc.nextLine()));
        this.dsTp.add(new ThucAn(ten,gia,anChay));
      }
    }
  }

  public void docFileTu() throws FileNotFoundException, ParseException {
    File f = new File("D:\\Code\\QuanLyTiec\\src\\main\\resources\\ThucPham\\ThucUong.txt");
    try ( Scanner sc = new Scanner(f)) {
      while (sc.hasNext()) {
        String n = (sc.nextLine());
        Double p = (Double.valueOf(sc.nextLine()));
        String prd = sc.nextLine();
        this.dsTp.add(new ThucUong(n,p,prd));
      }
    }
  }

  public void showDstp(){
    System.out.println("----Danh sách các món ăn của nhà hàng-----");
    this.dsTp.forEach(s->s.show());
  }

  public List<ThucPham> traCuuGia(double a, double b) {
    return this.dsTp.stream().filter(s -> s.getGiaTp() >= a && s.getGiaTp() <= b).collect(
        Collectors.toList());
  }

  public List<ThucPham> traCuuTen(String tp) {
    return this.dsTp.stream().filter(s -> s.getTenTp().contains(tp)).collect(Collectors.toList());
  }


  public List<ThucPham> getDsTp() {
    return dsTp;
  }

  public void setDsTp(List<ThucPham> dsTp) {
    this.dsTp = dsTp;
  }
}
