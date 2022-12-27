package com.spring.spa.board.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


/*LOMBOCK 기능 GETTER와 SETTER 를 자동으로 만들어줌 사용법은 인터넷 참고* */
@Getter
@Setter
public class BoardVo {
	
    private int sno;
    private int grp;
    private int seq;
    private int deep;
    private int hit;
    private int attCnt;
    private String id ;
    private String nal ;
    private String subject ;
    private String doc ;

}
