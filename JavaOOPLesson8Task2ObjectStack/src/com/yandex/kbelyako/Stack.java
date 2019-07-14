package com.yandex.kbelyako;

import java.util.Arrays;

public class Stack {

	private Object[] objectsArray;
	private Class[] blackList;

	public Stack() {
		super();
		objectsArray = new Object[10];
		blackList = new Class[10];

	}

	public void addObject(Object obj) {

		if (check(obj) == true) {
			for (int i = 0; i < objectsArray.length; i++) {
				if (objectsArray[i] == null) {
					objectsArray[i] = obj;
					break;
				}

			}
		} else {
			System.out.println("Object can't be added, it's in blacklist");
		}

	}

	public Object getObject() {
		Object obj = null;
		for (int i = 1; i < objectsArray.length; i++) {
			if (objectsArray[i] == null && objectsArray[i - 1] != null) {
				obj = objectsArray[i - 1];
				break;
			}
		}

		return obj;

	}

	public Object getAndDeleteObject() {
		Object obj = null;
		for (int i = 1; i < objectsArray.length; i++) {
			if (objectsArray[i] == null && objectsArray[i - 1] != null) {
				obj = objectsArray[i - 1];
				objectsArray[i - 1] = null;
				break;
			}
		}

		return obj;

	}

	public void addClasstToBlackList(Class cl) {

		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i] == null) {
				blackList[i] = cl;
				break;
			}

		}

	}

	public void rmvClassFromBlackList(Class cl) {

		for (int i = 0; i < blackList.length; i++) {
			if (blackList[i] == cl) {
				blackList[i] = null;
				break;
			}

		}

	}
	
	private boolean check(Object obj) {
		boolean result = true;
		for (int i = 0; i < blackList.length; i++) {

			if (blackList[i] != null) {

				if (blackList[i] == (obj.getClass())) {
					result = false;
					break;
				}
			}

		}
		return result;
	}

	@Override
	public String toString() {
		return "Stack [objectsArray=" + Arrays.toString(objectsArray) + "]";
	}

}
