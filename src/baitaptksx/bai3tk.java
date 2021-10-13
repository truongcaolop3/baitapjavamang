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
public class bai3tk {
    public static void Ascending(int []arr) {
		int temp;
		for (int i=0; i<=arr.length-2; i++) {
			for (int j=i+1; j<=arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp tăng dần: ");
		bai1tk.xuat(arr);
		System.out.println();
	}
	public static void Decreasing(int []arr) {
		int temp;
		for (int i=0; i<=arr.length-2; i++) {
			for (int j=i+1; j<=arr.length-1; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp giảm dần: ");
		bai1tk.xuat(arr);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài mảng =  ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		bai1tk.nhap(arr);
		bai1tk.xuat(arr);
		System.out.println();
		Ascending(arr);
		Decreasing(arr);
		scanner.close();
	}
}
