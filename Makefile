#This is a Makefile for this project

./env-setup.sh


Client_Editor	:$(objects)
		 jar cf Client_Editor $(objects)


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
		rm $(Target)/$(objects)

