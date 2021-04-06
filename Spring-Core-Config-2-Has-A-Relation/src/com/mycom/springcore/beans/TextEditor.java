package com.mycom.springcore.beans;

public class TextEditor {
private SpellChecker spellChecker;
public TextEditor(SpellChecker spellChecker) {
	System.out.println("INside TextEditor constructor");
	this.spellChecker=spellChecker;
}
public void spellChecker() {
	spellChecker.checkSpelling();
}
}
