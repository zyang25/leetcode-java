package com.zyang25.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.zyang25.code.L35_SearchInsertPosition;

class L35Test {
	private int target = 0;
	
	@Before
	void setUp() {
		
	}

	@Test
	void searchInsert_Return0_IfArraysIsEmpty() {
		int[] nums = new int[] {};
		
		target = 0; 
		
		int r = L35_SearchInsertPosition.Solution.searchInsert(nums, target);
		
		assertEquals(0, r);
	}
	
	@Test
	void searchInsert_Return0_WhenGiven1With1() {
		int[] nums = new int[] {1};
		
		target = 1;
		
		int r = L35_SearchInsertPosition.Solution.searchInsert(nums, target);
		
		assertEquals(0, r);
	}
	
	@Test
	void searchInsert_Return2_WhenGiven01234WithTarget2() {
		int[] nums = new int[] {0,1,2,3,4};
		
		target = 2;
		
		int r = L35_SearchInsertPosition.Solution.searchInsert(nums, target);
		
		assertEquals(2, r);
	}
	
	@Test
	void searchInsert_Return5_WhenGiven01234WithTarget5() {
		int[] nums = new int[] {0,1,2,3,4};
		
		target = 5;
		
		int r = L35_SearchInsertPosition.Solution.searchInsert(nums, target);
		
		assertEquals(5, r);
	}

}
