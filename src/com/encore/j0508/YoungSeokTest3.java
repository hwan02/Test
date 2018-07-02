package com.encore.j0508;

import java.util.Vector;

public class YoungSeokTest3 {
	public  static void main(String [] args) {
		//중요 : Vector 데이터 추가, 삭제, 수정, 검색
				Vector<String> v =new Vector<>();
				
				//데이터 추가
				v.add("자바"); //인덱스 0
				v.add("SQL"); //인덱스 1
				v.add("HTML"); //인덱스 2
				v.add("JavaScript"); //인덱스 3
				v.add("JSP"); //인덱스 4
				v.add("자바"); //인덱스 5
				
//				데이터 삭제
				v.remove(0); //첫번째 데이터 삭제해라
//				v.remove("자바"); //이렇게 해도 삭제 됨

//				데이터 수정
//				v.set(int index, String element);
				v.set(4, "자바프로그래밍");
				
//				데이터 조회
//				System.out.println("인덱스4 : " + v.get(4));
				

//				for(; 배열명.length;) //배열 경우
//				for(; 문자열.length();) //문자열 경우
//				for(; 백터명.size();) //백터 경우
				
//				전체 데이터 조회
				for(int i = 0; i<v.size(); i++) {
					String s = v.get(i);
					System.out.println(i+" : "+s);
				}
				

				
	}//main
}//class VectorTest3
