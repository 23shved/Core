package src.ua.lviv.shved.myarraylist;

import java.util.Arrays;

public class PersonalArrayList {

	private String[] listOfData;
	private int length;

	public PersonalArrayList(int length) {
		this.length = length;
		this.listOfData = new String[this.length]; 
	}

	public PersonalArrayList() {
		this.length = 15;
		this.listOfData = new String[this.length]; 

	}
	
	public void add(String data, int position) {
		if(position>=listOfData.length) {
			throw new IllegalArgumentException("The length of your array is lower than index");
 
		}
		listOfData[position] = data;
	}
	public void add(String value) {
		int dataSize = 0;

		for (int i = 0; i < listOfData.length; i++) {
			if (listOfData[i] != null) {
				dataSize++;
			}
		}

		if ((dataSize + 1) > listOfData.length) {
			String[] newlistOfData = new String[listOfData.length + 5];

			for (int i = 0; i < listOfData.length; i++) {
				newlistOfData[i] = listOfData[i];
			}

			listOfData = newlistOfData;
			length = newlistOfData.length;
		}

		listOfData[dataSize++] = value;
	}
	public void remove(int position) {
		if(position>=listOfData.length) {
			throw new IllegalArgumentException("The length of your array is lower than index");
 
		}
		listOfData[position] = null;
	}
	public String removeFrom(int index) {
		String removedValue = listOfData[index];

		String[] newListOfData = new String[listOfData.length - 1];

		for (int i = 0; i < index; i++) {
			newListOfData[i] = listOfData[i];
		}

		for (int i = index; i < listOfData.length - 1; i++) {
			newListOfData[i] = listOfData[i + 1];
		}

		listOfData = newListOfData;
		length = newListOfData.length;

		return removedValue;
	}
	
	@Override
	public String toString() {
		return "PersonalArrayList [listOfData=" + Arrays.toString(listOfData) + ", length=" + length + "]";
	}
}
