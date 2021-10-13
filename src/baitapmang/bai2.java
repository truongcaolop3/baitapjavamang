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
public class bai2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài của n =  ");
		int n = scanner.nextInt();
		int []arr = new int[n];
		bai1tk.nhap(arr);
		bai1tk.xuat(arr);
		System.out.println();
		bai1.Average(arr);
	}
}
