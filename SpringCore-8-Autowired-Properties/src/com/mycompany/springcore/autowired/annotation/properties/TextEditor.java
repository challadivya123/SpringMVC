package com.mycompany.springcore.autowired.annotation.properties;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
@Autowired
private SpellChecker spellChecker;
public TextEditor() {
	System.out.println("Inside texteditor constructor");
}
public SpellChecker getSpellChecker() {
	return spellChecker;
}
public void spellCheck() {
	spellChecker.checkSpelling();
}
}
