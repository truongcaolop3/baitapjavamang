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
public class bai2tk {
    public static void Find(int []arr, int item) {	
        int count = 0;
        for (int i=0; i<=arr.length-1; i++) {
                if (arr[i] == item) {
                        System.out.printf("Vị trị của %d bằng với %d là %d", arr[i], item, i);
                        System.out.println();
                        count++;
                } else {
                        System.out.printf("Vị trị của %d bằng với %d là %d", arr[i], item, (-1));
                        System.out.println();
                }
        }
        if ((arr.length == 0) || (count == 0)) {
                System.out.println("Không có giá trị tìm kiếm nào thỏa mãn !");
        }

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài mảng = ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        bai1tk.nhap(arr);
        bai1tk.xuat(arr);
        System.out.println();
        System.out.print("Số cần tìm = " + " ");
        int item = scanner.nextInt();
        Find(arr, item);
        scanner.close();
    }
}
