package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/*
 *기능:회원가입,로그인,회원탈퇴,회원수정 안만든다지금
 */
@Mapper
public interface UserRepository { // CRUD 레파지스토리 마다 무조건 만든다 id프라이머리키
    public int insert(String username, String password, String email);

    public List<User> findAll();

    public User findById(int id);

    public int updateById(int id, String password); // 우리사이트는 이것만 가능해 수정 안되면지워

    public int deleteById(int id);

}
