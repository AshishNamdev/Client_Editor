#This is a Maakefile for this project

src=src/clienteditor
Target=build/classes

Client_Editor	:AgeValidator.class Client.class MaritalStatusConverter.class \
		 EmailValidator.class  RequiredStringValidator.class
		 jar cf Client_Editor $(Target)/AgeValidator.class $(Target)/Client.class \
		 $(Target)/MaritalStatusConverter.class $(Target)/EmailValidator.class \
		 $(Target)/RequiredStringValidator.class


Client.class	: $(src)/Client.java
			javac -d  $(Target)/.  $(src)/Client.java

MaritalStatusConverter.class	:$(src)/MaritalStatusConverter.java
					javac -d $(Target)/.  $(src)/MaritalStatusConverter.java

AgeValidator.class : $(src)/AgeValidator.java
			javac -d  $(Target)/.  $(src)/AgeValidator.java

EmailValidator.class	:$(src)/EmailValidator.java
			javac -d  $(Target)/.  $(src)/EmailValidator.java

RequiredStringValidator.class : $(src)/RequiredStringValidator.java
			javac -d  $(Target)/.  $(src)/RequiredStringValidator.java

clean	:
		rm AgeValidator.class Client.class MaritalStatusConverter.class \
			EmailValidator.class RequiredStringValidator.class

