package com.fz.mapper;

import com.fz.entity.Student;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by webrx on 2017-08-23.
 */
public interface StudentMapper {

    @Insert("insert into bb values(null,'${name}',${score},'${address}')")
    public int insert(Student student);

    @Insert("insert into bb values(null,#{name},#{score},#{address})")
    public int insertinto(Student student);


}
