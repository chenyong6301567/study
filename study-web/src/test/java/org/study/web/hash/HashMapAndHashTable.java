package org.study.web.hash;

import java.util.HashMap;
import java.util.Hashtable;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.study.SpringBootMain;

/**
 * @author cy
 * @Description 
 * @date 2017年10月16日上午11:25:25 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HashMapAndHashTable {

	static Hashtable<Integer, Integer> table = new Hashtable<>();
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		//testHashTable();
		testHashMap();
	}

	/**
	* @Title testHashMap
	* @author cy
	* @Description 
	* @date 2017年10月16日上午11:31:24
	* @param 
	* @param 
	* @param 
	* @return void
	* @throws:
	*/
	private static void testHashMap() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程1执行");
				for (int i = 0; i < 10000; i++) {
					map.put(i, i);
				}
				System.out.println("线程1---------" + map.get(1000));
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程2执行");
				for (int i = 1000; i < 20000; i++) {
					map.put(i, i);
				}
				System.out.println("线程2---------" + map.get(5500));
			}
		}).start();

	}

	/**
	* @Title testHashTable
	* @author cy
	* @Description 
	* @date 2017年10月16日上午11:29:45
	* @param 
	* @param 
	* @param 
	* @return void
	* @throws:
	*/
	private static void testHashTable() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程1执行");
				for (int i = 0; i < 1000; i++) {
					table.put(i, i);
				}
				System.out.println("线程1---------" + table.get(500));
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("线程2执行");
				for (int i = 1000; i < 2000; i++) {
					table.put(i, i);
				}
				System.out.println("线程2---------" + table.get(1500));
			}
		}).start();

	}

}
