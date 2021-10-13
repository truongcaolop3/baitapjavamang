/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang;

import baitaptksx.bai1tk;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai4 {
    public static void hienthi(int []arr) {
        for (int i=arr.length-1; i>=0; i--) {
                System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài của mảng =  ");
        int n = scanner.nextInt();
        int []arr = new int [n];
        bai1tk.nhap(arr);
        System.out.println("In mảng từ trái sang phải: ");
        bai1tk.xuat(arr);
        System.out.println();
        System.out.println("In mảng từ phải sang trái: ");
        hienthi(arr);
        System.out.println();
        scanner.close();
    }
}
