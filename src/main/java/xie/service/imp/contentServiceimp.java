package xie.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xie.dao.ContentDao;
import xie.pojo.Content;
import xie.service.ContentService;

import java.util.List;

@Service
public class contentServiceimp implements ContentService {

    @Autowired
    public ContentDao contentDao;

    @Override
    public List<Content> selectcont(Content content) {
        return contentDao.selectcont(content);
    }

    @Override
    public Integer insertContent(Content c) {

        return contentDao.insertContent(c);
    }
}
