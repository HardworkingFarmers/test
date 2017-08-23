package com.fz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by webrx on 2017-08-23.
 */

@Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int score;
    private String address;

}
