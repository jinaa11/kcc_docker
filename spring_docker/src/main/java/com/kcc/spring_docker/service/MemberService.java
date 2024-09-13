package com.kcc.spring_docker.service;

import com.kcc.spring_docker.mapper.MemberMapper;
import com.kcc.spring_docker.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    public List<MemberVO> selectAllMembers(){
        return memberMapper.selectAllMembers();
    }
}
