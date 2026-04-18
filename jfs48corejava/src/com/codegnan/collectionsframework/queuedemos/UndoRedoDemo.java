package com.codegnan.collectionsframework.queuedemos;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoRedoDemo {

	public static void main(String[] args) {

		Deque<String> undoStack = new ArrayDeque<>();
		Deque<String> redoStack = new ArrayDeque<>();

		undoStack.push("Type A");
		undoStack.push("Type B");
		undoStack.push("Type C");// top

		System.out.println("Undo Stack before pop" + undoStack);

		String removedElement = undoStack.pop();

		System.out.println("UndoStack After undo Operation" + undoStack);

		redoStack.push(removedElement);

		System.out.println("RedoStack " + redoStack);

		removedElement = redoStack.pop();
		undoStack.push(removedElement);

		System.out.println("UndoStack After redo operation: " + undoStack);
	}

}
