package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        int i = input.length();
        int answer = 0;

        for (int center = 0; center <= 2*i-1; center++){
            int left = center/2;
            int right = left + center%2;
            while (left >= 0 && right < i && input.charAt(left)== input.charAt(right)){
                answer++;
                left--;
                right++;
            }
        }
        return answer;
    }
}
