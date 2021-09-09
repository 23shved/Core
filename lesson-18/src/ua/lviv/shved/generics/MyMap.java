package ua.lviv.shved.generics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MyMap<K, V> extends MyEntry<K, V> {

	private LinkedHashMap<K, V> map;

	public MyMap(K k, V v) {
		super(k, v);
		this.map = new LinkedHashMap<K, V>();
		this.map.put(k, v);
	}

	public void addNewEntry(K k, V v) {
		map.put(k,v);
	}

	public void removeEntry(K k) {
		map.remove(k);
	}
	public void removeValue(K k, V v) {
		Iterator<Entry<K,V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K,V> next =  iterator.next();
			if(next.getKey().equals(k)) {
				next.setValue((V) "null");
			}
		}
		
	}
	public void viewKey() {
		Iterator<Entry<K,V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K,V> next =  iterator.next();
			System.out.println(next.getKey().toString());
		}
		
	}
	public void viewValue() {
		Iterator<Entry<K,V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K,V> next =  iterator.next();
			System.out.println(next.getValue().toString());
		}
		
	}
	public void viewMap() {
		Iterator<Entry<K,V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K,V> next =  iterator.next();
			System.out.println("Value:  "  +next.getKey().toString() + " Key:  "  + next.getValue().toString());
		}
		
	}
}
