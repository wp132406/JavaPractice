/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   └MelonChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class MelonChart {
	
	public static void main(String[] args) {
		
		// 초기 설정
		
		List<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Psycho", "Muse"));
		list.add(new Music("Don't Let It Break Your Heart", "Coldplay"));
		list.add(new Music("Pompeii", "BΔSTILLE"));
		
		
		
		// 1차 출력
		
		System.out.println("-<< 멜론 차트 >>-");
		printList(list);
		System.out.println();
		
		
		
		// 2차 출력
		
		list.add(1, new Music("Shots", "Imagine Dragons"));
		
		System.out.println("-<< 2위 곡 추가 >>-");
		printList(list);
		System.out.println();
		
		
		// 3차 출력
		
		list.set(2, new Music("A Sky Full Of Stars", "Coldplay"));
		
		System.out.println("-<< 3위 곡 변경 >>-");
		printList(list);
		System.out.println();
		
		
		// 4차 출력
		
		list.remove(3);
		
		System.out.println("-<< 4위 곡 삭제 >>-");
		printList(list);
		System.out.println();
		
		
		// 전체 삭제
		
		list.clear();
		
		System.out.println("-<< 전체 리스트 삭제 >>-");
		printList(list);	// 출력될 리가 없겠지
	}
	
	public static void printList(List<Music> list)
	{
		int i = 1;
		for(Music music : list)
		{
			System.out.println(i + ". " + music);
			i++;
		}
	}
}
