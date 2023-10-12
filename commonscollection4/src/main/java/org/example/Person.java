package org.example;

import org.apache.commons.beanutils.PropertyUtils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;

public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Person person = new Person();
        person.setName("Leo");
        String name = (String) PropertyUtils.getProperty(person, "name");
        System.out.println(name);
//        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
//        for(PropertyDescriptor pd : beanInfo.getPropertyDescriptors()){
//            System.out.println(pd.getName());
//            System.out.println("ReadMethod:"+pd.getReadMethod());
//            System.out.println("WriteMethod:"+pd.getWriteMethod());
//        }
    }
}

