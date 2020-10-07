package xie.dao;

import org.apache.ibatis.annotations.Mapper;
import xie.pojo.Content;

import java.util.List;

@Mapper
public interface ContentDao {

    public List<Content> selectcont(Content content);

    Integer insertContent(Content c);
}
