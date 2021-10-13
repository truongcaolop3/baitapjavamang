/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptksx;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class bai1tk {

    /**
     * @param arr
     * @param args the command line arguments
     */
    public static void nhap(int []arr) {
		for (int i=0; i<=arr.length-1;i++) {
			double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
			arr[i] = randomInt;
		}
	}
    public static void Find(int []arr, int item) {
		int index = 0;
		for (int i=0; i<=arr.length-1; i++) {
			if (arr[i] == item) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}
		System.out.println("Chỉ số đầu tiên tìm kiếm được là: " + index);
	}
    public static void xuat(int []arr) {
        for (int i=0; i<=arr.length-1; i++) {
                System.out.print(arr[i] + " ");
        }

    }
    public static void trave() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Độ dài mảng = ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        nhap(arr);
        xuat(arr);
        System.out.println();
        System.out.print("Số cần tìm = ");
        int item = scanner.nextInt();
        Find(arr, item);
        scanner.close();
    }
    public static void main(String[] args) {
            // TODO Auto-generated method stub
            trave();
    }
    
}
