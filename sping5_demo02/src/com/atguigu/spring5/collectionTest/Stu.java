package com.atguigu.spring5.collectionTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ccstart
 * @create 2022-04-19 22:57
 */
public class Stu {
    //1.数组类型
    private String[] course;

    //2.list类型
    private List<String> list;

    //3.map类型
    private Map<String,String> maps;

    //这个学生学习的多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    //set集合
    private Set<String> sets;

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Stu(String[] course, List<String> list, Map<String, String> maps) {
        this.course = course;
        this.list = list;
        this.maps = maps;
    }

    public Stu() {
    }

    public void test(){
        System.out.println(Arrays.toString(course));
        list.forEach(System.out::println);
        System.out.println(maps);
        System.out.println(sets);
        courseList.forEach(System.out::println);
    }
}
