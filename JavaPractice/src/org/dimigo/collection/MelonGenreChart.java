/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   └MelonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 *
 * @author 		: 김우범
 * @version 	: 1.0
 */
public class MelonGenreChart {
	
	public static void main(String[] args) {
		
		List<Music> rockList = new ArrayList<>();
		List<Music> britpopList = new ArrayList<>();
		
		Map<String, List<Music>> map = new HashMap<>();
		
		rockList.add(new Music("Back In Black", "AC/DC"));
		rockList.add(new Music("Map Of The Problematique", "Muse"));	// 특별 곡
		rockList.add(new Music("It's My Life", "Bon Jovi"));
		
		britpopList.add(new Music("A Sky Full Of Stars", "Coldplay"));
		britpopList.add(new Music("Things We Lost In The Fire", "BΔSTILLE"));
		
		
		map.put("락", rockList);
		map.put("브릿팝", britpopList);
		
		
		
		// 1차 출력
		
		System.out.println("-----<< 멜론 장르별 차트 >>-----");
		printMap(map);
		System.out.println();
		
		
		// 2차 출력
		
		map.get("락").set(2, new Music("Map Of Your Head", "Muse"));	// 특별 곡 2
		System.out.println("-----<< 락 3위 곡 변경 >>-----");
		printMap(map);
		System.out.println();
		
		
		// 3차 출력
		
		map.get("락").remove(0);
		System.out.println("-----<< 락 1위 곡 삭제 >>-----");
		printMap(map);
		System.out.println();
		
		
		// 전체 삭제
		
		map.clear();
		System.out.println("-----<< 전체 리스트 삭제 >>-----");
		printMap(map);	// 이게 출력될 리가 없겠지
	}
	
	
	public static void printMap(Map<String, List<Music>> map)
	{
		for(String key : map.keySet())
		{
			System.out.println("[" + key + "]");
			// MelonChart.printList(map.get(key));
			
			int i = 1;
			for(Music music : map.get(key))
			{
				System.out.println(i + ". " + music);
				i++;
			}
		}
	}
}
