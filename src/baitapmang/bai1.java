/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapmang;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void nhap(int []arr) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = scanner.nextInt();
			
		}
		scanner.close();
	}
	public static void Average(int []arr) {
		double average = 0;
		for(int i=0; i<=arr.length-1; i++) {
			average += arr[i];
		}
		System.out.println("Average of array is " + (average / arr.length));
	}
	
	public static void xuat(int []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		nhap(arr);
		xuat(arr);
		System.out.println();
		Average(arr);
	}
    
}
