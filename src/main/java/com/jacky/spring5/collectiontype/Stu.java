package com.jacky.spring5.collectiontype;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 2022/4/2
 */
public class Stu {
    private String[] courses;
    private List<String> list;
    private Map<String, String> maps;
    private Set<String> sets;
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test() {
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
