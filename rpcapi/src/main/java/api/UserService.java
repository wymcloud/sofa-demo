package api;

import dto.UserResutlDTO;

/**
 * @author wym
 * @create 2018-08-07 10:07
 **/
public interface UserService {
    UserResutlDTO getUserInfo(Integer id,String name,Integer age);
}
