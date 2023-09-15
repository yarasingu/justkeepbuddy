package com.yarisingu.pgman.users;

import org.springframework.stereotype.Component;
import lombok.Data;


@Data
@Component
public class User {

    
    int id;
    String name;
    String age;
    String room;
    long idproof;
    String adress;
    
}
