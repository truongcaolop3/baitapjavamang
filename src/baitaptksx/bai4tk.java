/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptksx;

import baitaptksx.bai1tk;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai4tk {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài mảng =  ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		bai1tk.nhap(arr);
		bai1tk.xuat(arr);
		System.out.println();
		bai3tk.Ascending(arr);
		bai3tk.Decreasing(arr);
		System.out.println();
		System.out.print("Số cần tìm =  ");
		int item = scanner.nextInt();
		bai1tk.Find(arr, item);
		System.out.println();
		bai2tk.Find(arr, item);
    }
}
