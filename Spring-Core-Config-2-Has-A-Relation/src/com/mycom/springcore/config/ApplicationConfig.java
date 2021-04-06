package com.mycom.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycom.springcore.beans.SpellChecker;
import com.mycom.springcore.beans.TextEditor;

@Configuration
public class ApplicationConfig {
@Bean
public TextEditor textEditor() {
	return new TextEditor(spellChecker());
}
@Bean
public SpellChecker spellChecker() {
	return new SpellChecker();
}
}
