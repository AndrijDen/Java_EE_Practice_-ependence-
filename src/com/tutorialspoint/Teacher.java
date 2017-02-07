package com.tutorialspoint;

import java.util.Collection;

public class Teacher implements Performer{
public Teacher(){}
public void perform(){
for (Name all:name){
all.sayname();
}
}
private Collection<Name> name;
public void setName(Collection<Name> name){
this.name = name;
}
}