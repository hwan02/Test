package com.encore.j0508;

import java.util.Vector;

public class YoungSeokTest3 {
	public  static void main(String [] args) {
		//�߿� : Vector ������ �߰�, ����, ����, �˻�
				Vector<String> v =new Vector<>();
				
				//������ �߰�
				v.add("�ڹ�"); //�ε��� 0
				v.add("SQL"); //�ε��� 1
				v.add("HTML"); //�ε��� 2
				v.add("JavaScript"); //�ε��� 3
				v.add("JSP"); //�ε��� 4
				v.add("�ڹ�"); //�ε��� 5
				
//				������ ����
				v.remove(0); //ù��° ������ �����ض�
//				v.remove("�ڹ�"); //�̷��� �ص� ���� ��

//				������ ����
//				v.set(int index, String element);
				v.set(4, "�ڹ����α׷���");
				
//				������ ��ȸ
//				System.out.println("�ε���4 : " + v.get(4));
				

//				for(; �迭��.length;) //�迭 ���
//				for(; ���ڿ�.length();) //���ڿ� ���
//				for(; ���͸�.size();) //���� ���
				
//				��ü ������ ��ȸ
				for(int i = 0; i<v.size(); i++) {
					String s = v.get(i);
					System.out.println(i+" : "+s);
				}
				

				
	}//main
}//class VectorTest3
