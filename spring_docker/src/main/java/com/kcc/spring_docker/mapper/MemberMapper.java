package com.kcc.spring_docker.mapper;


import com.kcc.spring_docker.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> selectAllMembers();
}