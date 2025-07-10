package org.example.model;

public class Bed {
  private String style;
  private int pillows;
  private int height;
  private int sheets;
  private int quilts;

  public Bed(String style, int pillows, int height, int sheets, int quilts) {
    this.style = style;
    this.pillows = pillows;
    this.height = height;
    this.sheets = sheets;
    this.quilts = quilts;
  }

  public void make() {
    System.out.println("The bed is being made.");
  }

  public int getQuilts() {
    return quilts;
  }

  public int getSheets() {
    return sheets;
  }

  public int getHeight() {
    return height;
  }

  public int getPillows() {
    return pillows;
  }

  public String getStyle() {
    return this.style;
  }
}
