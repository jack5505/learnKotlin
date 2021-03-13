package com.example.tictactoys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class See {
    public static void main(String[] args) {
        List<List<Integer>> listList = new ArrayList<>();
        int n ,m ;
        int x, y;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for(int i = 1 ; i <= m ;i ++)
        {
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (listList.get(x) != null){
                listList.get(x).add(y);
            }else{
                listList.add(new ArrayList<>());
            }
            if(listList.get(y) != null){
                listList.get(y).add(x);
            }else{
                listList.add(new ArrayList<>());
            }
        }


    }
}
