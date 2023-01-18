package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/*
 *기능:회원가입,로그인,회원탈퇴,회원수정 안만든다지금
 */
@Mapper
public interface UserRepository { // CRUD 레파지스토리 마다 무조건 만든다 id프라이머리키
    public int insert(@Param("username") String username, @Param("password") String password,
            @Param("email") String email);

    public List<User> findAll();

    public User findById(int id);

    public int updateById(@Param("id") int id, @Param("password") String password);

    public int deleteById(int id);

    public User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
