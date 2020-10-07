package xie.service;

import xie.pojo.Content;

import java.util.List;

public interface ContentService {

    public List<Content> selectcont(Content content);

    Integer insertContent(Content c);
}
