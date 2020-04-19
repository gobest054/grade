package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float base_grade = in.nextFloat();
        int count_student=0;
        for(;;){ // while(true) //จำนวนบรรทัด
            if(n==count_student){
                System.out.println("Full");
                break;
            }
            float sum_grade = 0;
            int count_subject = 0;
            for(;;){ //ในแต่ละ บรรทัด รับกี่ตัว
                float grade = in.nextFloat();
                if(grade<0){
                    break;
                }
                else{
                    sum_grade = sum_grade + grade;
                    count_subject++;
                }
            }
            float gpax = sum_grade / count_subject;
            if(gpax>=base_grade){
                System.out.println("Congrat");
                count_student++;
            }
            else{
                System.out.println("sorry");
            }
        }
    }
}
