package cn.liuxingwei.spring.boot.mapper;

import cn.liuxingwei.spring.boot.model.DirectAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DirectAccountMapper {
    List<DirectAccount> selectAll();
}
