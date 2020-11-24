package com.algorithm.programmers;

//2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
//두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
//요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
//
//입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.
//
//제한 조건
//2016년은 윤년입니다.
//2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
//입출력 예
//a	b	result
//5	24	TUE

public class Programmers_Solution11 {
	public static void main(String[] args) {
		String result = solution(5,24);
		System.out.println(result);
	}
	
	public static String solution(int a, int b) {
        String answer = "";
        int day = 0;
        for(int i = 1; i<a ;i++) {
        	switch(i) {
        	case 2:
        		day+=29;
        	break;
        	case 1: case 3: case 5: case 7: case 8 : case 10: case 12:
        		day+=31;
        	break;
        	default:
        		day+=30;
        	break;
        	}
        }
        day+=b;
        System.out.println(day);
        if(day%7 == 1) {
        	return "FRI";
        } else if(day%7 == 2) {
        	return "SAT";
        } else if(day%7 == 3) {
        	return "SUN";
        } else if(day%7 == 4) {
        	return "MON";
        } else if(day%7 == 5) {
        	return "TUE";
        } else if(day%7 == 6) {
        	return "WED";
        } else if (day%7 == 0) {
        	return "THU";
        }
        return answer;
    }
}
